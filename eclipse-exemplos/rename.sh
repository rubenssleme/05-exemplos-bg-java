#!/bin/bash
while IFS="," read -r CP01 CP02;do
mv /home/cip/projetos-github/workspace-github/rubensLeme-bg/example/$CP01  /home/cip/projetos-github/workspace-github/rubensLeme-bg/example/$CP02
done<dirs_n.csv