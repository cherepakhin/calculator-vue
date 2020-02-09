# Собрать образ с именем cherepakhin/calc-vue:v1 из Dockerfile в текущем каталоге(.)
# cherepakhin - https://hub.docker.com репозиторий
# calc-vue - имя образа
# v1 - метка, версия
sudo docker build -t cherepakhin/calc-vue:v1 .

# Загрузка В https://hub.docker.com
#sudo docker push cherepakhin/calc-vue:v1

# Загрузка ИЗ https://hub.docker.com
#sudo docker pull cherepakhin/calc-vue:v1