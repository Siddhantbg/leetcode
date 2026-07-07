# 206. Reverse Linked List

- **Difficulty:** Easy
- **Link:** [reverse-linked-list](https://leetcode.com/problems/reverse-linked-list/)
- **Language(s):** java
- **Time complexity:** O(n)
- **Space complexity:** O(1)
- **Runtime:** 0 ms
- **Memory:** 44.4 MB

## Notes

### Reverse a Linked List (Node by Node)

**Example:**

```text
3 → 2 → 1 → NULL

prev = NULL
curr = 3
```

#### **Iteration 1**

```java
ListNode next = curr.next;
```

```
next → 2
curr → 3
```

```java
curr.next = prev;
```

```
3 → NULL
2 → 1
```

```java
prev = curr;
```

```
prev → 3 → NULL
```

```java
curr = next;
```

```
curr → 2 → 1
```

---

#### **Iteration 2**

Current:

```
prev → 3 → NULL
curr → 2 → 1
```

```java
next = curr.next;
```

```
next → 1 
```

```java
curr.next = prev;
```

```
2 → 3 → NULL
```

```java
prev = curr;
```

```
prev → 2 → 3 → NULL
```

```java
curr = next;
```

```
curr → 1
```

---

#### **Iteration 3**

Current:

```
prev → 2 → 3 → NULL
curr → 1
```

```java
next = curr.next;
```

```
next → NULL
```

```java
curr.next = prev;
```

```
1 → 2 → 3 → NULL
```

```java
prev = curr;
```

```
prev → 1 → 2 → 3 → NULL
```

```java
curr = next;
```

```
curr → NULL
```

Loop ends.

### Final Result

```
prev → 1 → 2 → 3 → NULL
```

### Trick to Remember

For every node, perform these **4 steps**:

1. **Save** the next node (`next = curr.next`)
2. **Reverse** the link (`curr.next = prev`)
3. **Move** `prev` forward (`prev = curr`)
4. **Move** `curr` forward (`curr = next`)

**Mnemonic:** **Save → Reverse → Move Prev → Move Curr**.

_Last updated: 2026-07-07_
