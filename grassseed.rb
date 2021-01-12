c=gets.to_f
if(0<c and c<=100)
  l=gets.to_i;
  if(0<l and 1<=100)
    sum=0.0;
    for i in 1..l
      w,h=gets.chomp.split.map(&:to_f)
      sum+=w*h
    end
  end
  puts sum*c
end