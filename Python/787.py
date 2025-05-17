from typing import List

class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, k: int) -> int:
        # Initialize distances array with infinity for unreachable cities
        distances = [float('inf')] * n
        distances[src] = 0

        # Iterate for each stop
        for _ in range(k + 1):
            # Create a copy of distances array to avoid updating during iteration
            new_distances = distances[:]

            # Update distances based on flights
            for flight in flights:
                u, v, w = flight
                if distances[u] != float('inf') and distances[u] + w < new_distances[v]:
                    new_distances[v] = distances[u] + w

            distances = new_distances

        return -1 if distances[dst] == float('inf') else distances[dst]

# Example usage
solution = Solution()
n = 4
flights = [[0,1,1],[0,2,5],[1,2,1],[2,3,1]]
src = 0
dst = 3
k = 1
result = solution.findCheapestPrice(n, flights, src, dst, k)
print(result)
