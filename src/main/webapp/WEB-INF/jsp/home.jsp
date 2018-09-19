<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type= "text/javascript" src="/jquery/jquery-3.3.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div id="navbar"><span>Geolocation API</span></div>
  <div id="wrapper">
    <button id="location-button">Get User Location</button>
    <div id="output"></div>
  </div>
  
  <script>
          $('#location-button').click(function(){
        
            if (navigator.geolocation) {
                navigator.geolocation.getCurrentPosition(function(position){
                  console.log(position);
                  $.get( "http://maps.googleapis.com/maps/api/geocode/json?latlng="+ position.coords.latitude + "," + position.coords.longitude +"&sensor=false", function(data) {
                    console.log(data);
                  })
                }); 
            }
          });
  </script>
</body>
</html>