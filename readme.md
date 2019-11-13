(This tool was made because I'm lazy and don't want to type every single line in the hosts file myself.)

(Is a script version possible?)

## What is it?

Basically, you enter the site names in one file, the top level domains in another file and the generator creates a host file that blocks those domains.

## Usage

You need 3-4 Files. Everything must be seperated by line breaks

* head: (not needed) When you look at your unedited hosts file, this is what should be put in here (additional lines that shouldn't be processed can be inserted too).
* tld: Top-Level Domains (eg. .com, .org, ...). Enter all you want to process. The dot before doesn't matter (`com` and `.com` work both. Don't remove a dot in the middle, like in `.co.uk`).
* input: These are the domains you want to block. Don't enter "www.". Also remove the TLDs, unless you don't want them to be combined with every TLD from the tld file.
* output: Well, the output. Specify the file path. It doesn't have to exist yet

The program must be run from a command line or terminal.

`hostsGenerator.jar </path/to/head> </path/to/tld> </path/to/input> </path/to/output>`

Without head:

`hostsGenerator.jar </path/to/tld> </path/to/input> </path/to/output>`

If you want to try it, there's a folder called "exampleFiles" in the repo
