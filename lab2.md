## **Lab Report 2**
---
Published April _th, 2023, by Derrick Lin

---
Hey everyone! I'm Derrick and today I'll be guiding you through **servers and bugs** in CSE 15L. I will be going over the following:
1. What a server that concatenates strings looks like on a server
2. Bugs in the code from lab 3 and how we test and fix them
3. Something I learned from lab week 2 or 3 that I didn't know before
---
# **Step 1**
**I've written a web server and called it StringServer. What it does when I run it with a port number, it has the ability to add strings to the line below the previous line. I will explain further in a bit! Here is the code that I wrote which allows said functions to be done:**
![Image](stringServer.png)

In the code above, I've set it so that adding a path like **`/add-message?s=<string>`** after our domain outputs the string we typed onto the web page.

![Image](stringServerPic1.png)

**Notice that in the URL, there were a bunch of %20s in between my text. You can include that as a space in the text, but if you type the string out with a space, %20 will autofull in those positions when you press enter.**

**I've added a different path and hit enter to show how it concatenates strings, the code I wrote added the first line + this second line**

![Image](stringServerPic2.png)

**This is what the path and output look like without any spaces:**
![Image](stringServerPic3.png)

**This is just an extra image explaining the %20 I've explained above.**
![Image](stringServerPic4.png)

In the screenshot of the StringServer class I posted above, the handleRequest method is called. It's called when 
`/add-message?s=<string>` is added as a path after the domain. The Server.start() method is also called, it's from another class called Server, and it starts the server and waits for incoming connections on a specified port number. Lastly, the main() method in the StringServer class is called to execute the program and pass the port number argument we give it.

The relevant arguments to the handleRequest method are the URI object representing the request URL. The relevent field of the Handler class is the StringBuilder object messages, which represents the accumulated messages received from previous requests. Its value changes when a new message is typed in with the `/add-message?s=<string>` block.

The values of the messages field of the Handler class change from specific re






Now that we know how StringServer works, lets move onto bugs from lab 3!

---
# **Step 2**
There were a variety of bugs from lab 3, today we will be looking at:
