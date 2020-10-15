function fizzbuzz(x)
  string = ""
  if x % 3 == 0
    string = string * "fizz"
  end
  if x % 5 == 0 
    string = string * "buzz"
  end

  if string == ""
    string = x
  end
  println(string)
end

[fizzbuzz(i) for i = 1:100]
