---
layout: schedule
---
<div class="banner">
  <img src="images/bluebinary.jpeg" alt="Banner">
  <h1>Colin's Blog!</h1>
</div>

<br>

<div class="desc-box">
  <h2>Hi, I'm Colin, and this is my Blog!</h2>
  <p>This is my blog for APCSA at Del Norte! You can read my blogs about my computer science journey by clicking the "blogs" button on the nav bar or read more about me below:</p>
</div>

<br>

<h3>About Me</h3>


<div class="grid">
  <div class="box">
    <img src="images/drawing.jpg" alt="Image">
    <h2>Who am I?</h2>
    <p>My name is Colin, and I'm a student at DNHS (Del Norte High School).</p>
  </div>
  <div class="box">
    <img src="images/dog.png" alt="Image">
    <h2>My Family</h2>
    <p>In my close family I have my parents, my sister, and a maltipoo named Ollie. I also have a large extended family of cousins.</p>
  </div>
  <div class="box">
    <img src="images/controller.png" alt="Image">
    <h2>Things I like to do</h2>
    <p>My favorite things to do are going to the beach, playing videogames, and code code coding!</p>
  </div>
  <div class="box">
    <img src="images/github.png" alt="Image">
    <h2>My coding journey</h2>
    <p>I started coding in Scratch. Later, I started taking Java classes, and finally I took APCSP and now APCSA.</p>
  </div>
</div>

<style>
    .banner {
        position: relative;
        width: 100%;
        height: 150px;
        overflow: hidden;
    }
    .banner img {
        width: 100%;
    }
    .banner h1 {
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
    }
    h1 {
        font-size: 50px;
    }

    .desc-box {
        background-color: rgba(0, 0, 0, 0.5);
        border-radius: 10px;
        width: 94%;
        padding: 20px;
    }

    .grid {
        display: grid;
        grid-template-columns: repeat(2, 1fr);
        grid-gap: 20px;
    }
    .box {
        background-color: rgba(0, 0, 0, 0.5);
        border-radius: 10px;
        padding: 20px;
    }
    .box img {
        width: 100%;
        border-radius: 5px;
    }
    .box h2 {
        margin-top: 10px;
    }
    .box p {
        margin-top: 10px;
    }
    
    h3 {
        margin-left: 10px;
        font-size: 30px;
        color: white;
        line-height: 1.5;
    }
</style>