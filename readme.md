(This tool was made because I'm lazy and don't want to type every single line in my hosts file myself.)

## What is it?

Basically, you enter the site names in one file, the top level domains in another file and the generator creates a host file that blocks those domains.

## Usage

You need 3-4 Files. Everything must be seperated by line breaks

* head: (not needed) When you look at your unedited hosts file, this is what should be put in here (additional lines that shouldn't be processed can be inserted too).
* tld: Top-Level Domains (eg. .com, .org, ...). Enter all you want to process
* input: These are the domains you want to block. Don't enter "www.". Also remove the TLDs, unless you don't want them to be combined with every TLD from the tld file.
* output: Well, the output. The file doesn't have to exist yet

The program must be run from a command line or terminal.

`hostsGenerator.jar <head> <tld> <input> <output>`

Without head:

`hostsGenerator.jar <tld> <input> <output>`