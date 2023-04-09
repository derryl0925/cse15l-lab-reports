## **Lab Report 1 - Remote Access and FileSystem**
Hey everyone! I'm Derrick and today I'll be guiding you through **remote access** in CSE 15L. To start, you will have to:
1. Lookup your course-specific account, log into your CSE 15L account, and change the password
2. Install VScode(Visual Studio Code) and git(if on Windows, allows you to use Mac/Linux commands on Windows*) *Windows commmands are different*
3. Remotely Connecting

# **Step 1**
In order to lookup your course-specific account, you will have to go to this <a href="https://sdacs.ucsd.edu/~icc/index.php "> page </a> and enter the following:
*username: **xxx**@ucsd.edu* (only enter the bolded part of your email)
*Student ID: **your PID** *

Once you login, you will see:
![Image](courseSpecificAccounts.png)

Now that you see this, click on the account for the corresponding course (in this case, it would be the one starting in **cs15l...**. You should see this:
![Image](courseSpecificAccountHomePage.png)

Click on **Global Password Change Tool** and click **Proceed to the Password Change Tool** under the **Student, AX, or Course-Specific Student Accounts** section. Once you are there, follow the instructions and change your password.

Now that we have completed Step 1, we can move onto Step 2.

# **Step 2**
VScode is an IDE(integraded development environment) that we can write and run code on. For the purpose of this tutorial, we will only be using the Terminal found within VScode. **Please note that using the Terminal on your computer works as well**.

To install VScode, visit: https://code.visualstudio.com/

To download git, visit: https://gitforwindows.org/
Follow steps <a href="https://stackoverflow.com/questions/42606837/how-do-i-use-bash-on-windows-from-the-visual-studio-code-integrated-terminal/50527994#50527994"> here </a> to set default terminal to **git bash** in VScode.

*Credit to Professor Politz for link above.*

**Now that we have finished steps 1 and 2, we will dive into remotely connecting.**

# **Step 3**
In order to start remote access, we will need to open up either our **Terminal** or **VScode**
Once you get either application open, enter **ssh cs15lsp23zz@ieng6.ucsd.edu**, with the **zz** being your specific number.

You will be asked to enter a password, that password will be whatever you set it to in the earlier steps.

It should look like this:
![Image](remoteLoginScreen.png)
