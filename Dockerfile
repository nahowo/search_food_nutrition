FROM ubuntu:latest
LABEL authors="nahyun"

# logstash 이미지 사용
FROM docker.elastic.co/logstash/logstash:7.10.2

## logstash 설정 파일 복사
COPY logstash.conf /usr/share/logstash/pipeline/logstash.conf

ENTRYPOINT ["top", "-b"]