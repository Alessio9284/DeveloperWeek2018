# installare gource
# crea il video a partire dai commit di Github
# mettere lo script nella cartella con il progetto, git pull e poi eseguire ./gourcevid.

gource \
    -s .06 \
    -1280x720 \
    --auto-skip-seconds .1 \
    --multi-sampling \
    --stop-at-end \
    --key \
    --highlight-users \
    --hide mouse,progress \
    --file-idle-time 0 \
    --max-files 0  \
    --background-colour 000000 \
    --font-size 22 \
    --title "Developers' week - Gruppo Alpha" \
    --output-ppm-stream - \
    --output-framerate 30 \
    | avconv -y -r 30 -f image2pipe -vcodec ppm -i - -b 8196K developerweekgit.mp4

#  -b 65536K crea un file ad altissima risoluzione (50MB). Mettere una risoluzione più bassa aiuta.
#  this will create movie.mp4
