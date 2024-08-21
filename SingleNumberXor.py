class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        cnt = 0
        for n in nums:
            cnt ^=n

        return cnt
