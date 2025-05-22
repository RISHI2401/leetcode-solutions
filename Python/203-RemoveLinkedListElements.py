class ListNode:
  def __init__(self, data, next=None):
    self.data = data
    self.next = next

# helper function to build a ListNode

def build_linked_list(values : list[int]) -> ListNode:
  if not values:
    return None
  head = ListNode(values[0])
  current = head
  for val in values[1:]:
    current.next = ListNode(val)
    current = current.next
  return head

# helper function to traverse and see the linked list

def traverse(head : ListNode):
  current = head
  while(current):
    print(current.data, end=" -> ")
    current = current.next
  print("None")


def removeElements(head : ListNode, val : int) -> ListNode:

  dummy = ListNode(-1)
  dummy.next = head
  current = dummy

  while current and current.next:
    if current.next.data == val:
      current.next = current.next.next
    else:
      current = current.next

  return dummy.next

# creating list node
head = [1,2,6,3,4,5,6]
val = 6
node = build_linked_list(head)
result = removeElements(node, val)
traverse(result)



