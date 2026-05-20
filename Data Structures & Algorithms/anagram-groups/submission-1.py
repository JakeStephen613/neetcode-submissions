class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = defaultdict(list) # creates empty list for new keys 
        for s in strs: 
            key = tuple(sorted(s)) ## turns list into immutable 
            groups[key].append(s)
        return list(groups.values())