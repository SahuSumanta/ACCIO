# ACCIO 

### you can add your solution here it help peoples to learn more better by reviewing different code.

# How To: Fork a GitHub Repository & Submit a Pull Request

## 1 Forking the Repository

## 2 Clone your new fork locally 
git clone https://github.com/SahuSumanta/ACCIO.git

## 3 Track the original repository as a remote of the fork
git remote add --track master upstream git@github.com:SahuSumanta/ACCIO.git </br>
git fetch upstream

## 4 Create a new branch for your changes
git checkout -b fix-readme-typo upstream/master

## 5 Make your changes!

## 6 Add, commit, and push the changes
git add . </br>
git commit -m "Fix grammar mistakes in the readme file" </br>
git push -u origin fix-readme-typo

## 7 Submit your pull request

