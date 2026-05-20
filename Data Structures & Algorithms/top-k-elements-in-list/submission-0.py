import heapq
from collections import Counter

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        heap = []
        counts = Counter(nums)
        for c in counts:
            heapq.heappush(heap, (-counts[c], c))
        result = []
        for _ in range(k):
            result.append(heapq.heappop(heap)[1])
        return result