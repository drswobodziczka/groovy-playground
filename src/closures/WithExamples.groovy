package closures

def res = new StringBuilder().with(true) {
    append("appended!")
    return "returned"
}
assert res.toString().equals("appended!")

def res22 = new StringBuilder().with {
    append("appended!")
    return "returned"
}
assert res22.toString().equals("returned")