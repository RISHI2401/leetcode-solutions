import heapq
from collections import Counter

def frequencySort(s):
    # Create a frequency map using Counter
    char_count = Counter(s)
    
    # Use a max heap to sort characters by frequency
    max_heap = [(-count, char) for char, count in char_count.items()]
    heapq.heapify(max_heap)

    # Build the result string
    result = []
    while max_heap:
        count, char = heapq.heappop(max_heap)
        result.append(char * (-count))

    return ''.join(result)

# Example usage:
s = "tree"
result = frequencySort(s)
print(result)
