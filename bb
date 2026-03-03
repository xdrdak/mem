# !/bin/sh

BRANCH=$(git for-each-ref --count=10 --sort=-committerdate refs/heads/ --format='%(refname:short)' | gum filter)

git co $BRANCH
