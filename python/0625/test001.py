import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

# 이메일 보내기 함수
def send_email(subject, body, to_email):
    # SMTP 서버 설정
    smtp_server = 'smtp.gmail.com'
    smtp_port = 587
    smtp_user = 'yongwoon24@gmail.com'  # 여기에 Gmail 주소를 입력하세요
    smtp_password = 'tifebcdeiswnhlek'  # 여기에 앱 비밀번호를 입력하세요

    # 이메일 구성
    msg = MIMEMultipart()
    msg['From'] = smtp_user
    msg['To'] = to_email
    msg['Subject'] = subject

    # 이메일 본문 추가
    msg.attach(MIMEText(body, 'plain'))

    try:
        # SMTP 서버에 연결
        server = smtplib.SMTP(smtp_server, smtp_port)
        server.starttls()  # TLS 사용 시작
        server.login(smtp_user, smtp_password)  # 로그인

        # 이메일 보내기
        server.sendmail(smtp_user, to_email, msg.as_string())
        print("이메일이 성공적으로 보내졌습니다.")
    except Exception as e:
        print(f"이메일 전송 중 오류 발생: {e}")
    finally:
        server.quit()  # 서버 연결 종료

# 테스트 이메일 보내기
subject = "테스트 이메일"
body = "이것은 테스트 이메일입니다."
to_email = "yongwoon24@naver.com"  # 여기에 받는 사람 이메일 주소를 입력하세요

send_email(subject, body, to_email)
