words = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

x = input()
for word in words:
    x = x.replace(word,'*')
print(len(x))