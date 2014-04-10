$(document).ready(function(){

    var imgPrefix = '&lt img src="&lt c:url value="/resources/img';

    var imgSuffix = '" /&gt" style="width: 100px; margin-left: 10px;"/&gt';

    var cardPointArray = "${shuffledCardsPoints}";
    var cardNameArray = "${shuffledCardsNames}";

    var index = 0;
    var playerPoints = 0;
    var hostPoints = 0;

      $("#playerStart").click(function(){
          $(".backCards").show();
          playerPoints += (cardPointArray[0] + cardPointArray[1]);
          hostPoints +=  (cardPointArray[2] + cardPointArray[3]);
          index += 4;
          $("#playerScore").text(playerPoints);
          $("#hostScore").text(hostPoints);
      });

      $("#playerHit").click(function(){
           //$("#playerCards").append('<img src="<c:url value="/resources/img/back.jpg" />" style="width: 100px; margin-left: 10px;"/>');
            var imgSrc = imgPrefix + cardNameArray.get(index) + imgSuffix;
            index++;
            $("#playerCards").append(imgSrc);
            playerPoints += cardPointArray.get(index);
            $("#playerScore").text(playerPoints);
      });

      $("#hostHit").click(function(){
            var imgSrc = imgPrefix + cardNameArray.get(index) + imgSuffix;
            index++;
            $("#hostCards").append(imgSrc);
            hostPoints += cardPointArray.get(index);
            $("#hostScore").text(hostPoints);
            });

      $("#playerStand").click(function(){
         $("#playerHit").attr("disabled", true);
      });

      $("#hostStand").click(function(){
        $("#hostHit").attr("disabled", true);
      });

      $("#playerScore").change(function(){
            var score = $("#playerScore").val();
            if(score > 21) {
                $("#hostScore").html("Host Wins");
                $("#hostScore").css("color","red");
                $("#replayDiv").html(<button id="replayBtn" type="button"> Replay</button>);
            }
      });

      $("#hostScore").change(function(){
            var score = $("#hostScore").val();
            if(score > 21){}
                $("#playScore").text("Player Wins");
                $("#playScore").css("color","red");
                $("#replayDiv").html("<button id="replayBtn" type="button"> Replay</button>");
            }

      });

      $("#replayBtn").click(function(){
             location.reload();
      });
    });
