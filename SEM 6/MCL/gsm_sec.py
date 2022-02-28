#gsm_sec algorithm
import random
def a5(kc_64, fc_22):
    If sr1= LFSR(len_=19, clockbit-8, tapped [18, 17, 16, 13]) 
    ffsr2 = LFSR(len_-22, clockbit=10,tapped [21, 20])
    If sr3=LFSR(len_=23, clockbit=10, tapped [22, 21, 20, 7]) 
    def clock_with_num(num, numbits):
        for kb in range(numbits-1,-1,-1):
            b0 = get_bit(num, kb)
            Ifsr1.xor_lsb(b); Ifsr1.clock() Ifsr2.xor_lsb(b); Ifsr2.clock()
            Ifsr3.xor_lsb(b); Ifsr3.clock()
            clock_with_num(kc_64, 64)
            clock_with_num(fc_22,22) 
            for in range(100):
                major = majority (ifsr3)
                Ifsr2.clockbit, Ifsr3.clockbit)

if major a == Ifsr1.clockbit:

Ifsr1.clock()

if major == Ifsr2.clockbit:

Ifsr2.clock() if major == Ifsr3.clockbit:

Ifsr3.clock() def get_msb_bits(n):

ans = 0

for in range(114); bit = 2220

major = majority (Ifsr1.clockbit…
[10:48, 08/02/2022] MJ: kc_64 = sec_xor & ((1<<65) - 1) Isec_32, rsec_32 = get_Ir_32(sec_xor) sres_32= Isec_32^ rsec_32

print(fSigned Response (32 bits) =

(sres_32:d}')

Key (64 bits) =

return sres_32, kc_64

if _name_ _main_':

random.seed(0)

rand_128= (1<<127) +

random.getrandbits (127) ki 128= (1<<127) +

random.getrandbits(127)

sres_32, kc_64 = a3_a8(rand_128,

ki_128)

print(fRAND (128 bits)

{rand_128}')

print(fIndividual Auth Key (128 bits) =

{ki_128}')

=

Output:

RAND (128 bits)

= 321608337326328664597074568174572931021

Individual Auth Key (128 bits) = 334406522217975179801586818906323588181

Signed Response (32 bits) = 1365383352

Cipher Key (64 bits) = 7108256594706006286 Frame Counter (22 bits) = 3169372