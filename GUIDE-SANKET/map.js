"use strict";

function initMap() {
  const myLatLng = {
    lat: 18.5055,
    lng: 73.8763
  };
  const map = new google.maps.Map(document.getElementById("map"), {
    zoom: 17,
    center: myLatLng,
    fullscreenControl: true,
    zoomControl: true,
    streetViewControl: true
  });
  new google.maps.Marker({
    position: myLatLng,
    map,
    title: "Hello World!"
  });
}