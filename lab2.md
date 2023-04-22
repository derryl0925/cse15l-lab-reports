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

The values of the messages field of the Handler class change from specific request `/add-message?s=<string>`. The messages field is a StringBuilder object that represents the acucmulated messages received from previous requests. Inside the if block for the path to add a new message, the code appends the new message to the messages field. Therefore, the messages field is modified to include the new message from the current request. If the "s" query parameter is not present in the URL, the code does not modify the messages field. If there is no "s" in the URL, the code will return an error message. If our path **/add-message** is not in the URL, the if block in our StringServer class will not be executed and the code will check other possible paths in the handleRequest method.

Now that we know how StringServer works, lets move onto bugs from lab 3!

---
# **Step 2**
There were a variety of bugs from lab 3, today we will be looking at bugs within ArrayExamples.java!

To start, we have three methods, **reverseInPlace, reversed, and averageWithoutLowest**. Tests that should work but fail because there are bugs in the three methods above:

**Test for reverseInPlace:** 

`@Test
  public void reverseInPlace() {
    int[] input1 = {2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2}, input1);
  }`
