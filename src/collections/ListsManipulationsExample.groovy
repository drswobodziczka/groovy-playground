package collections

// iterating over
[1, 2, 4].each {
    println it
}

// multiply elements -- long syntax
def mapped = [1, 2, 4].collect {
    it * 1000
}
assert mapped == [1000, 2000, 4000]

// multiply elements -- short syntax
def multipled = [1, 2, 4]*.multiply(1000)
assert multipled == [1000, 2000, 4000]

// multiply lists
assert [1, 2, 4].multiply(2) == [1, 2, 4, 1, 2, 4]