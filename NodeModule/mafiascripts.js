//onload
window.onload=function()
{
    var body = document.querySelector("body");
    var h1 = document.createElement("h1");
    h1.innerHTML =Date();
    body.appendChild(h1);

    //create a navbar for our mafia page, unorderd list that will go horizontal across
    var navbar = document.createElement("ul");
    navbar.id= "navbar";
    var viewDiv = document.createElement("div");
    viewDiv.id = "viewDiv";
    body.appendChild(viewDiv);
    //line item 1
    var li1 = document.createElement("li");
    li1.id= "MyProfile";
    li1.innerHTML= "MyProfile";
    li1.addEventListener("click", function(){

        viewDiv.innerHTML = require("./profile.js");
        viewDiv.innerHTML+= profile.DonName;
        //viewDiv.innerHTML="test my profile text";
        //viewDiv.innerHTML += "  also there's this line";
        console.log("profile clicked");
    });
    navbar.appendChild(li1);

    //line item 2
    var li2 = document.createElement("li");
    li2.id= "Jobs";
    li2.innerHTML= "Jobs";
    li2.addEventListener("click", function(){
        viewDiv.innerHTML = " JOBS!";
        console.log("jobs clicked");

    });
    navbar.appendChild(li2);

    //line item 3
    var li3 = document.createElement("li");
    li3.id= "About Us";
    li3.innerHTML= "AboutUs";
    li3.addEventListener("click", function(){
        body.appendChild(aboutUsDiv);
        console.log("about us clicked");

    });
    navbar.appendChild(li3);

    body.appendChild(navbar);
}



console.log("test complete")
//require(aboutUs.js);
//require(jobs.js);
