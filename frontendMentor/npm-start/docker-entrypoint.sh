#!/bin/bash
set -e

if [ ! -f package.json ]; then
  echo "NOTE: hmm, I don't see a Package.json so I don't think there's a node site here"
  echo "Either you didn't mount a volume, or you mounted it incorrectly."
  echo "Be sure you're in your node site root and use something like this to launch"
  echo ""
  echo "docker run -p 3000:3000 -v \$(pwd):/apps melissakipp/npm-start"
  echo ""
  echo "NOTE: To create a new site, you can use the sister image melissakipp/node like:"
  echo ""
  echo "docker run -v \$(pwd):/app melissakipp/node <npm-package> <project-name>"
  exit 1
fi

bundle install --retry 5 --jobs 20

exec "$@"