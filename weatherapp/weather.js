const form = document.querySelector('form')
const search = document.getElementById('search');
const API_KEY = '3265874a2c77ae4a04bb96236a642d2f';

const getWeather = async (city) => {
    const url=`https://api.openweather.org/data/2.5/weather?q=${city}&appid=${API_KEY}`;
    
    const response = await fetch(url);
    console.log(response.json());
    const data = await response.json();
    console.log(data);

};

form.addEventListener('submit',function(event){
    getWeather(search.value);  // city name
    event.preventDefault();
});


// json is an array of objects 
// example
// var a = [{},{},{}]