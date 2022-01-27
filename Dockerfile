FROM 19-jdk-buster

RUN echo "\
    deb https://mirrors.tuna.tsinghua.edu.cn/debian/ buster main contrib non-free \
    deb https://mirrors.tuna.tsinghua.edu.cn/debian/ buster-updates main contrib non-free  \
    deb https://mirrors.tuna.tsinghua.edu.cn/debian/ buster-backports main contrib non-free \
    deb https://mirrors.tuna.tsinghua.edu.cn/debian-security buster/updates main contrib non-free \
    " > /etc/apt/sources.list

RUN apt-get update

RUN apt-get install net-tools

RUN apt-get install maven