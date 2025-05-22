class Node:
  def __init__(self, data):
    self.data = data
    self.next = None


# main
# Creating Node
Node1 = Node(10)
Node2 = Node(20)
Node3 = Node(30)

# Linking Nodes
Node1.next = Node2
Node2.next = Node3

# head node
head = Node1

# Function to traverse
def traverse(head : Node):
  current = head
  while current:
    print(current.data, end = " -> ")
    current = current.next

  print("None")


# Inserting new node at the beginning
def insert_at_beginning(head, data):
  new_node = Node(data)
  new_node.next = head
  return new_node
  
# Insert at the end
def insert_at_end(head, data):
  new_node = Node(data)
  if not head:
    return new_node
  current = head
  while current.next:
    current = current.next
  current.next = new_node

  return head 

# Insert after a given node(middle)
def insert_after_node(prev_node, data):
  if not prev_node:
    print("Previous node can't be None")
    return
  
  new_node = Node(data)
  new_node.next = prev_node.next
  prev_node.next = new_node



# Main 
head = insert_at_beginning(head, 5)
head = insert_at_end(head, 7)
insert_after_node(Node2, 0) # It can not be head cause it is not returning anything and doing the task
traverse(head)