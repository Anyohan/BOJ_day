score = []
for i in range(5):
    studentScore = int(input())
    if studentScore >= 40:
        score.append(studentScore)
    else:
        score.append(40)
sum = int(sum(score))
av_score = sum/5
print(int(av_score))