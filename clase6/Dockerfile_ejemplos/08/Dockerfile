FROM python:slim-buster

WORKDIR /usr/src/app
RUN pip install --upgrade pip && pip install DateTimeRange colorama emoji openpyxl

CMD [ "sleep","86400" ]


#cuando quieren cambiar la version de python solo modifico el nombre de la imagen
#y se ejecuta el comando de la imagen
#ejemplo:
#FROM python:slim-buster
#CMD [ "sleep","86400" ]
#FROM python:3.8-alpine
#CMD [ "sleep","86400" ] asi solo modificando  y nuevamente construyo todo el proyecto.