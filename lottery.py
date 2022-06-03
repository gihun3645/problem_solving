# 이름 제비 뽑기
import random
list = ['맥북', '아이패드', '아이폰']
print(random.choice(list))

# 조 짜기
group = ['1', '2', '3', '4', '5', '6']
print(random.sample(group, 3))

# 로또 생성기
print(random.sample(range(1, 46), 5))
