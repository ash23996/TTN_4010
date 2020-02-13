var name =prompt("enter the string to check");
document.write("The string is =",name +"<br/> ");
var nameInReverse = name.split('').reverse().join('');
name.toUpperCase() === nameInReverse.toUpperCase() ?document.write("YES, IT IS A PLAINDROME ") :document.write("NO, IT IS NOT A PLAINDROME");
