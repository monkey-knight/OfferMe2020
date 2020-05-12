1. <font color="green">switch 语句</font>

     swith(?)：**? 只能是 int 类型的值或者可以自动转换成 int 类型的基本类型的值，如 char, short, byte, int,  Character, Short, Byte, Integer, Enum。此外，在 java1.7 之后，加入了 String 类型**

     - char, short, byte 类型会自动隐式转换成 int 类型。
     - Character, Short, Byte 类型会使用 java 的自动解包机制转换成基本的数据类型，然后隐式转换成 int 类型。
     - Enum 是枚举类型，实际比较的是 Enum 的 ordinal 值（表示枚举值的顺序，也为 int 类型）。
     - String 类型，比较的是 String 的 hashcode，其也是一个 int 类型的值。
     
2. default 顾名思义是缺省情况，只有任何条件都不匹配的情况下才会执行。