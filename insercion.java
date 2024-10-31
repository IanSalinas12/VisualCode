import math


def f1(x):
    if x < 2:
        return False
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True


def f2(n):
    a = []
    x = 2
    while len(a) < n:
        if f1(x):
            a.append(x)
        x += 1
    return a


def f3(n):
    b = []
    x = 1
    while len(b) < n:
        b.append(x)
        x += 2
    return b


def f4(x, y):
    c = (x // 2) * y
    d = ((x + 1) // 2) * y
    e = f2(c)
    f = f3(d)
    g = []
    h = 0
    i = 0

    for j in range(x):
        k = []
        if j % 2 == 0:
            for l in range(y):
                k.append(e[h])
                h += 1
        else:
            for l in range(y):
                k.append(f[i])
                i += 1
        g.append(k)

    return g


def imprime(m):
    for r in m:
        print(" ".join(map(str, r)))


def f6(m):
    for i in range(0, len(m) - 1, 2):
        for j in range(1, len(m[i]), 2):
            m[i][j], m[i + 1][j] = m[i + 1][j], m[i][j]


n, m = map(int, input().split())
matriz = f4(n, m)
f6(matriz)
imprime(matriz)