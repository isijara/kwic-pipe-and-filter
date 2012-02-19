# Overview

What does KWIC stand for?

**Key Word In Context**, basically it's a circular shifter that sorts
out keywords.

# How To Run

If you are using Linux, I wrote a small bash script to take care of 
all of the compiling and crap. I hate **ANT** so I made a pseudo makefile

```sh
./compile
./run
```

It's listening for data from STDIN and outputs to STDOUT so simple pipe
redirection will work great here.

Example usage:

```sh
cat file | ./run > output
```

Dead simple.

