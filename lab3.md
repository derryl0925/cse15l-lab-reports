## **Lab Report 3**
---
Published May 9th, 2023, by Derrick Lin

---
Hey everyone! I'm Derrick and today I'll be guiding you through commands in CSE 15L. There are a few interesting commands, `less`, `find`, and `grep`. Today we will take a deeper look and dive into the command **`grep`**!

We will be going over:
Four interesting command-line options or alternate ways to use **`grep`** as well as a few examples for each new option found on files and directories from `./technical`, which was a directory given in the CSE 15L stringsearch-data folder. The command `grep` by itself is used to search for a string in a given file or directory, but we will be exploring the various ways that can modify or filter the search.

---
# **Alternate ways to use `grep`**
There are a variety of ways one can use commands, I've looked online and found a few ways.

Here are four different ways to use `grep`:
- <a href="https://www.gnu.org/software/grep/manual/html_node/Matching-Control.html"> `grep -i 'string' fileName.txt` </a>: (this allows us to search for a string in a given file)
- <a href="https://linuxize.com/post/how-to-use-grep-command-to-search-files-in-linux/"> `grep -E '^s.*s$' ./file.txt` </a>: (allows us to search for a line that starts with something and ends with something specific)
- <a href="https://www.geeksforgeeks.org/grep-command-in-unixlinux/#"> `grep -r 'string' /path/to/directory` </a>: (searches for a string recursively in the directory and prints all lines that contain the string)
- <a href="https://man7.org/linux/man-pages/man1/grep.1.html"> `grep -v "string" ./file.txt` </a>: (searches a given file or directory for lines that exclude the string)

---
# **Examples of new ways to use `grep`**

**For the following examples, I've included both a screenshot of the output and a code block of the output.**

**Examples of using `grep -i "string" fileName.txt`:**
- `grep -i "alcohol" DraftRecom-PDF.txt`
This command searches for the string "alcohol" in the file. Now you may think that this is the same as `grep`, but the "-i" allows us to not care about case sensitivity. This means our command will search for the string alcohol, Alcohol, alCohol, etc. This is useful because when searching for a certain string, important ones we are looking for may be capitalized or something else, and `grep -i` allows us to bypass the issue of case sensitivity to make it not matter. As you can see in the example, Maybe I remembered something about this "Carl Soderstrom" person but didn't exactly remember his name. I did remember that he mentioned something with alcohol so I searched for the string alcohol in order to find what I was looking for.

The output is:
```
address the full spectrum of alcohol problems among ED
"alcohol problems" does not always include risky drinking and
detail on the spectrum of alcohol problems. He suggested the main
include the whole continuum of alcohol problems, not just a portion
of the continuum such as alcohol-dependent drinkers.
of alcohol problems" include primary prevention. She recommended
Carl Soderstrom wondered whether "alcohol problems" referred to
problems in addition to medical problems. The phrase "alcohol
"in the emergency setting" because alcohol problems are not limited
to patients. Perhaps the recommendations should address alcohol
Stephen Hargarten thought that the term "alcohol-related
... 
```
![Image](grep-iSpecificFile.png)

In order to use `grep -i` on a directory, it must be changed to "**ir**":
- `grep -ir "alcohol" .`
Instead of the ".", a path could have been typed, but I didn't do that because I already navigated inside that path to show that we can just look at all instances of "alcohol" for all files in the given path. This is useful just like the example above, but we can search multiple files at once and the output actually shows which file that line is located in.

The output is:
```
./DraftRecom-PDF.txt:address the full spectrum of alcohol problems among ED
./DraftRecom-PDF.txt:"alcohol problems" does not always include risky drinking and
./DraftRecom-PDF.txt:detail on the spectrum of alcohol problems. He suggested the main
... 
./Session2-PDF.txt:Identifying ED Patients with Alcohol Problems
./Session2-PDF.txt:Many patients in the emergency department (ED) have alcohol
./Session2-PDF.txt:further examine and refine alcohol-screening questionnaires in the
...
...
...
```
![Image](grep-irDirectory.png)

**Examples of using `grep -E '^s.*s$' ./file.txt`:**
- `grep -E '^s.*s$' ./DraftRecom-PDF.txt`
This command has the ability to apply unique filter. That filter is starting and ending with a specific letter or any character of your choice. I kept it simple and searched for lines that start with "s" and end with "s". I don't think I can come up with any practical use for this, but if you are specified something very specific such as finding a line that starts with a specific character and ends with a specific character, then you can use `grep -E`. Here, I search for a line that starts with 's' and ends with 's'. Keep in mind this only searched with lowercase s since I did not type 'S'.

The output is:
```
suggested another alternative, "problem drinking," which is
supporting text for this recommendation would include statements
screening and intervention in these settings. If this
specialized treatment and that some patients with hazardous
screening and interventions for alcohol problems among ED patients
should include an ED focus and that emergency medicine experts
spirituality and addiction came about by setting aside funds
specifically for this topic. He said the way to accomplish this is
... 
```
![Image](grep-EFile.png)

We can test this by searching another file in the ./technical directory:
- `grep -E '^s.*s$' ./Session2-PDF.txt`

The output is:
```
screening programs. A major limit to realizing this improvement is
```
![Image](grep-EanotherFile.png)

**Examples of using `grep -r 'string' /path/to/directory`:**
- `grep -r 'instruments' /home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems`
This command searches for a string recursively and prints all lines containing the given string. I've chosen the string "instruments" in this example to display the use of the `grep -r` command. This is useful as we can highlight a certain path and find keywords we are looking for. 

The output is:
```
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:Recommendation #2 Screening instruments under consideration for
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:between the screening instruments and the intervention, becomes
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:problematic. Enough research has been conducted on instruments
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:However, he believed research on screening instruments that is not
... 
```
![Image](grep-rInstruments.png)

Testing `grep -r` on a different string within ./technical:
- `grep -r 'alcohol' /home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems`
I've tested another instance of finding a string with `grep -r` to highlight the capabilities of this command.

The output is:
```
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:address the full spectrum of alcohol problems among ED
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:"alcohol problems" does not always include risky drinking and
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:detail on the spectrum of alcohol problems. He suggested the main
... 
```
![Image](grep-rAlcohol.png)

**Examples of using `grep -v "string" ./file.txt`:**
- `grep -v "alcohol" /home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt`
This command is quite unique. It actually returns every line that **DOES NOT** contain the string you gave it in the command. I've decided to exclude the string "alcohol" here. This is a pretty useful command as we can take out strings in lines we aren't looking for and search for lines without that string.

The output is:
```
Discussion of
Draft Recommendations

Daniel Hungerford opened the final session of the conference by
outlining the group's ultimate task-to create research
recommendations from conference deliberations. Before the
conference, he and Daniel Pollock drafted recommendations for the
steering committee to consider. During the conference, the steering
committee modified those recommendations, and they were distributed
to attendees for general discussion.
... 
```
![Image](grep-vSpecificFile.png)

I've now decided to show every line that excludes "alcohol" in each file within a specific path in ./technical:
- `grep -v "alcohol" /home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/*`
This is a variation of the command as I am searching for all files within the given directory excluding the string 'alcohol'.

The output is:
```
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:Discussion of
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:Draft Recommendations
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/DraftRecom-PDF.txt:Daniel Hungerford opened the final session of the conference by
... 
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/Session3-PDF.txt:and decisional considerations and for determining the need for
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/Session3-PDF.txt:and appropriateness of referrals to treatment. The success of
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/Session3-PDF.txt:motivational and patient-centered approaches seems to indicate that
/home/linux/ieng6/cs15lsp23/cs15lsp23gh/stringsearch/stringsearch-data/technical/government/Alcohol_Problems/Session3-PDF.txt:it is critical to take into account the motivation of the patient
...
...
...
```
![Image](grep-vStar.png)

---

Thank you for reading through my blog post and learning about `grep` commands with me! I managed to put this together with the help from a few online resources:
- https://www.gnu.org/software/grep/manual/html_node/Matching-Control.html
- https://linuxize.com/post/how-to-use-grep-command-to-search-files-in-linux/
- https://www.geeksforgeeks.org/grep-command-in-unixlinux/#
- https://man7.org/linux/man-pages/man1/grep.1.html

I hope you learned a lot from this and please feel free to reach out to me at **del021@ucsd.edu** if you have any questions!








