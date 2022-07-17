def concatenate(*args):
    return '-'.join(str(w) for w in args)


print(concatenate("I", "love", "Python", "!"))