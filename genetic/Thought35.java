package genetic;
import java.util.ArrayList;
class Thought35 extends Thought{
private static ArrayList<Thought35> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 184.3433351653583;
private double fd1 = 125.9794524460837;
private Thought fo0 = null;
private Thought fo1 = null;
Thought35 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought35 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought35 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought35 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought35 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought35 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought35 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought35 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought35 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        lb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought7.getInstance(fb0, fb1, lb0, fb0);
        fd0 *= -1;
        boolean lb2 = true;
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        for(int i1=0; i1<10; i1++){
            Thought lo3 = Thought36.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
            fb0 = fb1 && lb0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
            lb2 = fd0 > fd1;
            fd0 = fd1 - fd0;
            Output.points[8][5] -= fd1;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1);
}
            Output.points[8][6] -= fd0;
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
            boolean lb4 = false;
            fd1 = fd0 - fd1;
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo0 != null){
              fo0.m3(fd0, fd1, fd0, fd1);
}
            lb2 = fb0 && fb1;
            boolean lb5 = false;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
    Output.points[8][7] -= fd0;
    fd1 = fd0 + fd1;
    Output.points[8][8] -= fd0;
    double ld1 = 322.04659528636614;
    Thought lo2 = Thought77.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
    Thought lo3 = Thought91.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb0, ab1);
    boolean lb4 = true;
    boolean lb5 = false;
    ld1 = fd0 + fd1;
    ld1 = fd0 + fd1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, lb5, ab1, ab2, ab3);
}
    fd0 = fd1 + ld1;
    fd0 = fd1 + ld1;
    ab4 = fd0 > fd1;
    boolean lb6 = true;
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb4);
}
    boolean lb7 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    double ld8 = 383.6243068158035;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld8, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    boolean lb0 = false;
    double ld1 = 80.86417184065711;
    lb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    double ld2 = 541.0174947389131;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
}
    ad1 *= -1;
    ad2 *= -1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    double ld3 = 680.0857325575822;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 388.56337736487643;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    boolean lb1 = true;
    double ld2 = 869.0669509603792;
    boolean lb3 = false;
    ld0 = ld2 + ad1;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought33.getInstance(ad3, ad4, fd0, fd1, lb1, lb3, ab1, ab2);
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab3 = ab4 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(ld0, ld2, ad1, ad2);
}
        boolean lb5 = true;
        }
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, lb3, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    Output.points[0][0] += fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld0 = 361.9275109705174;
if(fo1 != null){
      fb1 = fo1.m2();
}
    fb0 = !fb1;
    Thought lo1 = Thought60.getInstance(ld0, fd0, fd1, ld0);
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Thought lo0 = Thought38.getInstance();
    ad2 = ad3 + ad4;
    double ld1 = 29.40347402146015;
    fb1 = ad4 > fd0;
    fd1 = ld1 - ad1;
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
        fb1 = fb0 && fb1;
        fd1 = ld1 + ad1;
        fb0 = fb1 && fb0;
        fb1 = !fb0;
        fb1 = fb0 && fb1;
        fb0 = ad2 > ad3;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][1] -= fd0;
    fd1 *= -1;
    boolean lb0 = false;
if(ao2 != null){
      fd0 = ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    Output.points[0][2] += fd0;
    double ld1 = 244.02141424641593;
    boolean lb2 = true;
    fd0 *= -1;
    ab1 = fd1 < ld1;
    ab2 = ab3 || ab4;
    Thought lo3 = Thought12.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb2);
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld1, fd0, fd1);
}
    Thought lo4 = Thought43.getInstance(fb1, lb0, lb2, ab1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb5 = true;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    double ld0 = 63.39069826668478;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        ad1 = ad2 + ad3;
        }
    double ld2 = 995.8290349654894;
    fb1 = ab1 && ab2;
    ab3 = !ab4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo3 = Thought18.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    Output.points[0][3] -= ld0;
if(fo1 != null){
      fo1.m3();
}
        ld2 = ad1 + ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ld0, ld2, ad1, ad2);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][4] -= fd0;
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = fd1 > fd0;
    Output.points[0][5] -= fd1;
    Output.points[0][6] -= fd0;
    fd1 *= -1;
    double ld1 = 446.0516405279997;
if(fo1 != null){
      fo1.m2();
}
    fb1 = ld1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    ld1 = fd0 - fd1;
    ld1 *= -1;
    double ld2 = 690.0560806428625;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    ab1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought86.getInstance();
    Output.points[0][7] -= fd1;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
    double ld1 = 158.79040554760124;
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ld1, fd0);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought43.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
    ld1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb2, ab1, ab2);
}
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb2 = ld1 > fd0;
    ab1 = fd1 < ld1;
    fd0 = fd1 - ld1;
    double ld4 = 450.9785470769733;

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought94.getInstance(fo1, fo0, fo1, fo0);
    double ld1 = 295.9502554447663;
    double ld2 = 173.06421185942133;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < ld1;
    fb1 = ld2 < ad1;
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3();
}
    Thought lo3 = Thought77.getInstance(ad4, fd0, fd1, ld1);
if(fo0 != null){
      ld2 = fo0.m3(fb0, fb1, fb0, fb1);
}
    Output.points[0][8] -= ad1;
    boolean lb4 = false;
    lb4 = fb0 || fb1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[1][0] += ld1;
    Output.points[1][1] -= ld2;

Thought.STACK_COUNTER++;
return lb4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd1 = ad1 - ad2;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
    ab1 = ad3 > ad4;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3();
}

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    Thought lo1 = Thought77.getInstance(fb1, lb0, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb0 = fb1 || lb0;
    fd0 = fd1 - fd0;
    double ld2 = 85.69037480516158;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    double ld3 = 29.86049383273574;
    Thought lo4 = Thought21.getInstance(ao1, ao2, ao3, ao4);

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 373.17019233807014;
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(ao1 != null){
          ao1.m1(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    ad1 = ad2 + ad3;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
        double ld0 = 982.5936260605226;
    ld0 *= -1;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - ld0;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fd0 = fd1 + ld0;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = !ab1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    ab2 = fd1 > ld0;
    ab3 = ab4 || fb0;
    fd0 = fd1 - ld0;
    Output.points[1][2] -= fd0;
    fb1 = ab1 || ab2;

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][3] -= ad1;
    ab2 = ab3 || ab4;
    ad2 *= -1;
    fb0 = fb1 && ab1;
    double ld0 = 201.30847619411998;
    double ld1 = 720.4605378278935;
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
    boolean lb2 = false;
    ab1 = ab2 && ab3;
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
}
    ld1 *= -1;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb2, ab1);
}

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought76.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    double ld1 = 292.6524005814776;
    Output.points[1][4] -= fd0;
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][5] += fd0;
    fd1 *= -1;
    double ld0 = 859.6196289101769;
    boolean lb1 = false;
    Output.points[1][6] -= ld0;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0);
}
    ab1 = ab2 || ab3;
    ab4 = fd1 < ld0;
    fd0 *= -1;
    boolean lb2 = false;
        boolean lb3 = false;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m2(fb1, lb1, lb2, lb3);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ab4 = fb0 || fb1;
    ld0 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb1, lb2, lb3, lb4);
}
    fd1 *= -1;
    if (ab1) {
}
Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
        double ld1 = 134.02101599260286;
        fb1 = ad3 > ad4;
        Output.points[1][7] -= fd0;
        boolean lb2 = false;
        fd1 = ld1 - ad1;
if(fo1 != null){
          ad2 = fo1.m3();
}
        double ld3 = 736.7926471219713;
        ad2 = ad3 + ad4;
        boolean lb4 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, ld3);
}
        boolean lb5 = true;
        lb2 = ad1 < ad2;
        Output.points[1][8] += ad3;
if(fo0 != null){
          ad4 = fo0.m3(lb4, lb5, lb0, fb0);
}
        fb1 = fd0 > fd1;
}
Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[2][0] -= ad2;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[2][1] -= fd0;
    ab2 = ab3 && ab4;
    Output.points[2][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought60.getInstance();
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    lb0 = ad3 < ad4;
    fd0 *= -1;
    fd1 *= -1;

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    Thought lo0 = Thought98.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
        fb0 = !fb1;
if(ao4 != null){
          ao4.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Output.points[2][3] += fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    Thought lo0 = Thought3.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        }
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Output.points[2][4] += ad4;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[2][5] += ad2;
    fb0 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
    Thought lo1 = Thought93.getInstance();
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ad1, ad2, ad3);
}
    Thought lo2 = Thought52.getInstance(fb0, fb1, fb0, fb1);
    Output.points[2][6] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Output.points[2][7] += ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    ab3 = ab4 && fb0;
    boolean lb1 = true;
    Thought lo2 = Thought38.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
    Thought lo3 = Thought13.getInstance(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
    double ld4 = 303.8801264175436;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld4, fd0, fb0, fb1, lb0, lb1);
}
    ab1 = fd1 > ld4;
    boolean lb5 = true;
    ab1 = fd0 > fd1;
    ab2 = !ab3;
    ab4 = !fb0;
    boolean lb6 = false;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(ld4, fd0, fd1, ld4);
}
    boolean lb7 = true;
    boolean lb8 = true;
    ab4 = fb0 || fb1;
    Output.points[2][8] += fd0;
if(ao2 != null){
      fd1 = ao2.m3(lb0, lb1, lb5, lb6);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld4, fd0, fd1, ld4);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Output.points[3][0] -= ad2;
    ab1 = ab2 && ab3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fb0 = !fb1;
if(fo1 != null){
          fo1.m1(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
        fd0 = fd1 - ad1;
        ad2 = ad3 - ad4;
        fd0 = fd1 - ad1;
        boolean lb1 = true;
        boolean lb2 = false;
if(ao1 != null){
          ad2 = ao1.m3();
}
}
Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 345.94695760416704;
    fd0 *= -1;
    fd1 *= -1;
    fb0 = !fb1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    double ld1 = 798.1537318481046;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    fd0 *= -1;
    boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb2 = fo0.m2(fd1, ld0, ld1, fd0, lb3, fb0, fb1, lb2);
}
if(fo1 != null){
          fo1.m2();
}
    fd1 = ld0 + ld1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb2);
}
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ab1 || ab2;
    double ld1 = 413.8610083906911;
    ab3 = !ab4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld2 = 571.2834699396865;
if(fo1 != null){
      ld2 = fo1.m3(fd0, fd1, ld1, ld2, fb1, lb0, ab1, ab2);
}
    fd0 *= -1;
    Output.points[3][1] -= fd1;
if(fo0 != null){
          ab3 = fo0.m2();
}
if(fo1 != null){
      ab4 = fo1.m2(ld1, ld2, fd0, fd1);
}
    ld1 = ld2 - fd0;
    double ld3 = 706.5487418273367;
    boolean lb4 = false;
        ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb4, ab1, ab2);
}
    boolean lb5 = false;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = lb1 || fb0;
        fd0 = fd1 + ad1;
    ad2 *= -1;
    fb1 = ad3 < ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
}
    boolean lb2 = true;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    lb1 = fd1 > ad1;
    Output.points[3][2] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    double ld0 = 77.06934796870947;
    ab1 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought10.getInstance(fo0, fo1, fo0, fo1);
    fb0 = !fb1;
    Output.points[3][3] -= ad3;
    ab1 = ab2 && ab3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    Output.points[3][4] -= ad4;
    ab2 = ab3 || ab4;
    double ld2 = 424.6006788718278;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo1.m3();
}
    fb1 = fd1 < ld0;
    ld2 = ad1 - ad2;
    ab1 = ab2 && ab3;
    Output.points[3][5] -= ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld0, ld2);
}
    boolean lb3 = false;
    ad1 *= -1;
    double ld4 = 300.5958980174315;
    ab3 = ad1 < ad2;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    double ld0 = 495.5741674080742;
    fd0 = fd1 + ld0;
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought97.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Thought lo2 = Thought70.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    ld0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld3 = 179.90544000915335;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, ld3, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      fd1 = ao3.m3(fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld0);
}
    Thought lo4 = Thought15.getInstance(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld0, fb0, fb1, fb0, fb1);

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
    fb1 = ad1 < ad2;
    fb0 = fb1 || fb0;
    fb1 = ad3 > ad4;
    boolean lb0 = false;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    Thought lo1 = Thought86.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3();
}
    ab2 = fd0 < fd1;
if(ao3 != null){
      ab3 = ao3.m2(fd0, fd1, fd0, fd1);
}
    Output.points[3][6] += fd0;
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    double ld2 = 280.5462392734901;
    Thought lo3 = Thought98.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0);
    fd1 *= -1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, lb0, lb1, ab1, ab2);
}
    Thought lo4 = Thought2.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
    lb0 = !lb1;
    boolean lb5 = false;
    lb5 = !ab1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[3][7] -= fd0;
    Thought lo6 = Thought56.getInstance(fd1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad1 *= -1;
    ab1 = ad2 < ad3;
    ad4 *= -1;
if(ao3 != null){
      ao3.m1(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = !ab4;
    boolean lb0 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    Output.points[3][8] += fd0;
if(ao4 != null){
      ao4.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    ab4 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought84.getInstance(fd1, ad1, ad2, ad3);
    double ld2 = 169.22644956836282;
    boolean lb3 = false;
    Thought lo4 = Thought1.getInstance(ab4, fb0, fb1, lb0);
    boolean lb5 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo6 = Thought66.getInstance(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3, lb3, lb5, ab1, ab2);
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    lb0 = lb3 || lb5;
    double ld7 = 472.11865709521044;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    double ld1 = 739.2598548845259;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
    Thought lo2 = Thought54.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
    fb1 = fd1 > ld1;
    fd0 *= -1;
    Thought lo3 = Thought95.getInstance();
    fd1 *= -1;
    lb0 = ld1 > fd0;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(fd1, ld1, fd0, fd1);
}
    boolean lb5 = true;
    Output.points[4][0] += ld1;
    Thought lo6 = Thought78.getInstance(lb4, lb5, fb0, fb1);
    boolean lb7 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    lb0 = fd1 > ld1;
    fd0 = fd1 - ld1;
    boolean lb8 = false;
    fd0 = fd1 - ld1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
        fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    lb0 = fb0 && fb1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(lb0, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1();
}
    fb1 = fd0 < fd1;
    Output.points[4][1] -= fd0;
    fd1 *= -1;
    double ld0 = 423.4090193462125;
    boolean lb1 = false;
    lb1 = !fb0;
if(fo1 != null){
          ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m3(fb1, lb1, fb0, fb1);
}
    Output.points[4][2] -= fd1;
    ld0 = fd0 - fd1;
    Thought lo2 = Thought15.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    ld0 *= -1;
    fb1 = lb1 || fb0;
    boolean lb3 = false;
    double ld4 = 168.1215279270488;
if(fo1 != null){
      ld4 = fo1.m3(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
