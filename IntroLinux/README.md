# Intro to Linux

## Goal
Familiarize most of you with a different OS and get you to test out networking tools.

For those of you that don't already have a Linux distribution on your computers, you can get a virtual OS manager, for more information see section on setup.

Linux is afterall a great environment to develop in and is present in industry.

## Setup

### Fetching Software
You will need a virtual manachine manager and a Linux distro image.

- Virtual Machine Manager
    * [VirtualBox](https://www.virtualbox.org/wiki/Downloads)
    * [VMWare Workstation](https://www.vmware.com/ca/products/workstation-player/workstation-player-evaluation.html)
- Linux distro
    * [Kali Linux](https://www.offensive-security.com/kali-linux-vm-vmware-virtualbox-image-download) (get the file corresponding to your VM Manager)
    * [Parrot OS](https://parrotlinux.org/download-home.php)
    * [Ubuntu Desktop LTS](https://ubuntu.com/download/desktop/thank-you?version=18.04.3&architecture=amd64)


### Installation 
After having download your VM manager and your desired OS, it's time to install them.

I will show you how to do this part in class using VirtualBox (or if you want to get ahead [VirtualBox tutorial](https://blog.storagecraft.com/the-dead-simple-guide-to-installing-a-linux-virtual-machine-on-windows/))

## Terminal
The terminal, your new best friend.

Here are some useful commands:

| Command | Explanation                                   |
|---------|-----------------------------------------------|
| `man`   | Show the manual of a given program            |
| `ls`    | List content of directory                     |
| `pwd`   | Print the name of working directory           |
| `cd`    | Change directory (relative or absolute paths) |
| `mv`    | Move (rename) files                           |
| `cp`    | Copy files/directories                        |
| `rm`    | Remove files                                  |
| `grep`  | Searches for string within files              |
| `clear` | Clears the terminal                           |
| `mkdir` | Make directory                                |
| `rmdir` | Remove directory                              |
| `uname` | System information                            |
| `w`     | Show who is logged on and what they're doing  |
| `touch` | Changing file timestamps                      |
| `cat`   | Concat files and print output                 |
| `less`  | Reades files (nav with j(up)-k(down))         |

### Application of New Things

**File Hierarchy in Linux**
* Learn more with `man file-hierarchy`.
* What does `/` represent?
* What is normally found in `bin`?
* For a given user, *bob*, what would be the path of his home directory?

**Movement in Folders**
* How do you go up 3 levels in the directory?
* Create a folder *my first directory* and navigate into it
* Within it, create the series of directories *a/b/c* and in *c* create a file called *c.txt*
* Delete everything inside *my first directory*

