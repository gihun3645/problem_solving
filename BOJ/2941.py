Croatia_list = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
word = input()

for x in Croatia_list:
    word = word.replace(x, '*')
print(len(word))
