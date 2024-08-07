# 데이터 셋 구조 확인
str(faithful)

# 라이브러리 설치
install.packages("openxlsx")
library("openxlsx")

write.xlsx(faithful, "C:/RPAWork/workspace/R/Rresult/faithful.xlsx")

install.packages("readxl")
library("readxl")
faithful_ds <- read_excel( "C:/RPAWork/workspace/R/Rresult/faithful.xlsx")
head(faithful_ds, n=10)


plot(faithful_ds)

eru.long <- faithful_ds[faithful_ds$eruptions > 3, ]
points(eru.long, col="red", pch=19) #색상과 산점도 모양 지정
# 선형 회기모델 추정
faith.rm <- lm(waiting ~ eruptions, data=faithful_ds)#종속변수 ~ 독립변수, 데이터셋

lines(x=faithful_ds$eruptions, y= fitted(faith.rm) , col="blue")

png( "C:/RPAWork/workspace/R/Rresult/result1.png", width=600, height=300)
plot(faithful_ds)
points(eru.long, col="red", pch=19)
lines(x=faithful_ds$eruptions, y= fitted(faith.rm) , col="blue")
dev.off()

