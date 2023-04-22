## **Lab Report 2**
---
Published April _th, 2023, by Derrick Lin

---
Hey everyone! I'm Derrick and today I'll be guiding you through **servers and bugs** in CSE 15L. I will be going over the following:
1. What a server that concatenates strings looks like on a server
2. Bugs in code and how we test and fix them
---
# **Step 1**
I've written a web server and called it StringServer. What it does when I run it with a port number, it has the ability to add strings to the line below the previous line. I will explain further in a bit! Here is the code that I wrote which allows said functions to be done:
![Image](stringServer.png)

In the code above, I've set it so that adding a path like **/add-message?s=`<string>`** after our domain outputs the string we typed onto the web page.
![Image](stringServerPic1.png)
![Image](stringServerPic2.png)
![Image](stringServerPic3.png)
![Image](stringServerPic4.png)

---
# **Step 2**
