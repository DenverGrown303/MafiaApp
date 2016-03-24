/**
	Tech. Requirements for Skill Distillery:
	1.CRUD
		-Users, can be created, updated, and destroyed
		-Mafia families can be CRUDed
		-individual mafia members can be CRUDed
		-Services/Jobs can be CRUDed
		-Shopping cart can be CRUDed
	2.JS
		-Will use to display all of our views on the index.html as one dynamic web page.
	3.RESTful calls
		-will use RESTful calls:
			HTTP verbs (GET, POST, PUT, DELETE, etc.) that web browsers use to retrieve web
			pages and to send data to remote servers. REST systems interface with external systems
			as web resources identified by Uniform Resource Identifiers (URIs), for example: /people/tom,
	4.AJAX an-synchronous
		-rely on Pelham/Aaron kick ass cooperation
	5.MySQL for persistent data
		-Tables in a SQL database schema, with one-to-one, one-to-many, and many-to-many relationships.
	6.A separate Web app, and separate Java app.
		-Encapsulation for the data that's displayed on the HTML/JS versus the Java app that will manipulate the data.
	7. Utilize Express.js framework to worth with a global object as opposed to a "document"
**/

/**
 TODO LIST:
 1.create our website framework, uber inspired.  Simple secionts, clear call to action e.g. (JOIN OUR TEAM
 2.ABOUT US view
 	-this will include a graphic display of the entire mob family, which will show the current position of the user in their game
 3.SERVICES view 1.0 pre-defined jobs, 2.0 custom services/jobs
 	-tongue in cheek drop down menu with witty refernces
 	-will include service objects such as book a goon, getaway driver, cement shoes, host a casino night, bookie record keeping etc.
 	-will include services will the impact the user's game?
 4.SHOPPING CART view
 	-display items in shopping cart
 	-checkout feature asking for "favors"
 5. CONCTACT US view
 	-Will have some funny information about New Jersey
 	-"Ask for Mikey"
**/
var button = document.getElementById("button");
button.addEventListener("click", function(e){
    console.log("clicked");
});
function clickIt() {
    var button = document.getElementById("button");
    setInterval(function(){
        button.click();
    }, 1000);
}
//start here
onload = function()
{
    var body = document.querySelector("body");

    var dateHeader = document.createElement("h1");
    h1.innerHTML =Date();
    body.appendChild(h1);

    //create a navbar for our mafia page, unorderd list that will go horizontal across
    var navbar = document.createElement("ul");

    //line item 1
    var li1 = document.createElmeent("li");
    li1.value= "Home";
    li1.innerHTML= "Home";
    ul.appendChild(li1);

    //line item 2
    var li2 = document.createElmeent("li");
    li2.value= "About Us";
    li2.innerHTML= "About Us";
    li2.addEventListener("click", function(){
        body.appendChild(aboutUsDiv);
    });

    //line item 3
    var li3 = document.createElmeent("li");
    li1.value= "Services";
    li1.innerHTML= "Services";

}










var li3 = document.createElmeent("li");
ul.appendChild(li1)

}

var h2 = document.createElement("h2");
h2.innerHTML = ;
body.appendChild(h2);

function activateNavMenu(){
   var navbar = document.createElement('navbar');
   body..append('navbar');

   var links = navbar.createElement('navbar');
   if(!links){return};

   for(var i=0;i<links.length;i++){
     if(links[i].getAttribute('href').indexOf
(window.location.href.split('//')[1].split('/')[2])!=-1){
       links[i].className='activemenu';
     }
   }
}

//onload
window.onload=function(){
     activateNavMenu();
   }


//copied script




   var p1 = document.createElement("p");
   var id = p1.createAttribute("id")
   id.value= "disclaimer";
   p1.innerHTML = window.prompt("What do you want to put in your first paragraph?");
   body.appendChild(p1);

   var p2 = document.createElement("p");
   p2.innerHTML= window.prompt("What do you want to put in your first paragraph?");
   p2.setAttributeNode();
   body.appendChild(p2);
