package genetic;
import java.util.ArrayList;
class Thought24 extends Thought{
private static ArrayList<Thought24> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 977.7917028183571;
private double fd1 = 317.5303099655614;
private Thought fo0 = null;
private Thought fo1 = null;
Thought24 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought24 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought24 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought24 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought24 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[7][2] -= fd0;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        for(int i1=0; i1<10; i1++){
            Thought lo1 = Thought26.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
            Thought lo2 = Thought92.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
if(fo0 != null){
              fo0.m3(fd1, fd0, fd1, fd0);
}
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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[7][3] -= fd0;
    fd1 = fd0 + fd1;
    Output.points[7][4] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 197.07520788764478;
    boolean lb1 = false;
    ab4 = fb0 && fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, lb1, lb2, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld3 = 86.6431799413743;
    boolean lb4 = false;
    fb0 = fb1 || lb1;
    fd0 = fd1 + ld0;
    lb2 = ld3 > fd0;
    lb4 = ab1 && ab2;

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
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    lb1 = !fb0;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought93.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    lb0 = ad2 < ad3;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(fo1 != null){
      ab3 = fo1.m2();
}
    Output.points[7][5] -= ad4;
    Thought lo0 = Thought14.getInstance(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;

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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    double ld0 = 225.43688896878365;
    fb0 = ld0 > fd0;
    double ld1 = 829.9205782069907;
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
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
    fb1 = fb0 || fb1;
if(ao2 != null){
      ad2 = ao2.m3();
}
if(ao3 != null){
      ao3.m1(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        Thought lo1 = Thought95.getInstance(ao4, fo0, fo1, ao1);
        ad1 *= -1;
        ad2 = ad3 - ad4;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
        ad4 *= -1;
        Output.points[7][6] -= fd0;
        if (fb0) {
if(ao1 != null){
              fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
            if (fb0) {
                fb1 = !lb0;
if(fo1 != null){
                  fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
                boolean lb2 = true;
if(ao2 != null){
                  ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
                for(int i1=0; i1<10; i1++){
                    ad3 = ad4 - fd0;
                    Thought lo3 = Thought52.getInstance(lb0, fb0, fb1, lb2);
if(ao1 != null){
                      ao1.m2();
}
}}}}
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
    double ld0 = 345.34734880496154;
        ab2 = ab3 || ab4;
    double ld1 = 712.2764988307232;
if(ao2 != null){
      fb0 = ao2.m2(ld1, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    ld1 *= -1;
    Output.points[7][7] -= fd0;
    ab4 = fb0 && fb1;
    ab1 = fd1 > ld0;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ld1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 *= -1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ld1 > fd0;
if(ao1 != null){
      ao1.m3(fd1, ld0, ld1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m2();
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    ld0 = ld1 + fd0;
if(ao4 != null){
      ab1 = ao4.m2(fd1, ld0, ld1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 - ld1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    boolean lb0 = true;
    boolean lb1 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[7][8] -= fd1;
if(fo1 != null){
      ad1 = fo1.m3(ab4, fb0, fb1, lb0);
}
    Thought lo2 = Thought23.getInstance();
    lb1 = ad2 < ad3;
if(ao1 != null){
      ab1 = ao1.m2(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
    boolean lb3 = false;
    fb0 = fb1 && lb0;
    fd0 *= -1;
    Thought lo4 = Thought63.getInstance(ao2, ao3, ao4, fo0);
    Thought lo5 = Thought29.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, lb1, lb3, ab1, ab2);
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4);
}
    lb0 = lb1 && lb3;
    ab1 = fd0 < fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
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
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
    double ld1 = 36.29781118795417;
    boolean lb2 = false;
    boolean lb3 = false;
    Thought lo4 = Thought15.getInstance();
    lb0 = !lb2;
    lb3 = fb0 || fb1;
        boolean lb5 = true;
    boolean lb6 = true;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, fd0, lb0, lb2, lb3, lb5);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb6 = fb0 || fb1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb0, lb2, lb3, lb5);
}
    fd1 = ld1 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb6, fb0, fb1, lb0);
}
    double ld7 = 371.67156418236516;

Thought.STACK_COUNTER++;
return lb2;
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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought26.getInstance(fd0, fd1, fd0, fd1);
    ab4 = fb0 && fb1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
    Output.points[8][0] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    fd0 *= -1;
    boolean lb3 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, lb3, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb4 = false;
    boolean lb5 = true;
    lb1 = lb2 && lb3;
    fd0 = fd1 + fd0;
    lb4 = fd1 > fd0;
    Output.points[8][1] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(lb5, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return ab4;
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
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    Output.points[8][2] -= ad1;
    fb1 = !lb0;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        double ld1 = 834.3405969170493;
        fb0 = fb1 || lb0;
        ld1 *= -1;
        ad1 = ad2 + ad3;
        Output.points[8][3] += ad4;
        fb0 = !fb1;
        Output.points[8][4] -= fd0;
        fd1 = ld1 + ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        Thought lo2 = Thought31.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb3 = true;
        lb0 = fb0 || fb1;
}
Thought.STACK_COUNTER++;
return lb0;
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
    Output.points[8][5] += ad1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = fd1 > ad1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        ab1 = !ab2;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = fd1 > ad1;
if(fo1 != null){
          fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
              fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
            for(int i2=0; i2<10; i2++){
                ad4 = fd0 - fd1;
}}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][6] += fd0;
    double ld0 = 300.4567802114904;
if(ao2 != null){
      ao2.m2();
}
    double ld1 = 857.8527804454446;
if(ao3 != null){
      ao3.m3(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    ld1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, lb2, fb0, fb1, lb2);
}
    double ld3 = 407.8143864922905;
    fb0 = ld3 < fd0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb2);
}
    fb0 = !fb1;
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ld1, ld3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld1);
}
    Output.points[8][7] -= ld3;
    double ld5 = 469.57527578421065;
    Output.points[8][8] -= ld5;
if(ao4 != null){
      fd0 = ao4.m3(lb2, lb4, fb0, fb1);
}
    Thought lo6 = Thought89.getInstance();
    fd1 = ld0 + ld1;
if(fo0 != null){
      ld3 = fo0.m3(ld5, fd0, fd1, ld0, lb2, lb4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb2;
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
    fb1 = ad2 < ad3;
    fb0 = fb1 || fb0;
    fb1 = ad4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
    fb1 = fd1 < ad1;

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
    ab2 = ab3 && ab4;
    fb0 = fd1 < fd0;
    boolean lb0 = false;
    double ld1 = 417.22231848496796;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    if (ab4) {
        boolean lb2 = true;
        Thought lo3 = Thought5.getInstance();
        double ld4 = 975.4861427407975;
        ld1 = fd0 - fd1;
        ab4 = ld4 > ld1;
        double ld5 = 360.7453646490846;
        double ld6 = 841.7463192321183;
if(fo0 != null){
          ao4 = fo0.m4(ld6, ld1, fd0, fd1, fb0, fb1, lb2, lb0);
}
        ab1 = !ab2;
        ab3 = ab4 || fb0;
        fb1 = !lb2;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          ld4 = fo0.m3(fo1, ao1, ao2, ao3, ld5, ld6, ld1, fd0, lb0, ab1, ab2, ab3);
}
        } else if (fb0) {
        fd1 = ld1 - fd0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
        Output.points[0][0] -= ld1;
        Output.points[0][1] -= fd0;
if(ao3 != null){
          fd1 = ao3.m3(ld1, fd0, fd1, ld1);
}
        Thought lo7 = Thought71.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
if(ao3 != null){
          ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
}}
Thought.STACK_COUNTER++;
return lb0;
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
if(ao2 != null){
      ad1 = ao2.m3();
}
if(ao3 != null){
          ad2 = ao3.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
    ab1 = ad3 > ad4;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ab3 = ad3 > ad4;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fb0 = ao1.m2(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
        Output.points[0][2] -= ad2;
        ad3 *= -1;
        Thought lo0 = Thought83.getInstance(fb1, ab1, ab2, ab3);
}
Thought.STACK_COUNTER++;
return ab4;
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
      fo0 = fo1.m4();
}
    double ld0 = 20.76852682389066;
    fb0 = !fb1;
    Thought lo1 = Thought66.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    double ld2 = 85.18439806964817;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    boolean lb3 = false;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb3;
    fb0 = fb1 && lb3;
    fb0 = fb1 || lb3;
    Thought lo4 = Thought19.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, fb0, fb1, lb3, fb0);
    double ld5 = 158.52656133656697;

Thought.STACK_COUNTER++;
return ld5;
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
    if (ab1) {
        double ld0 = 417.8787654080016;
        ab2 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
        Thought lo1 = Thought71.getInstance(ld0, fd0, fd1, ld0);
        ab4 = fd0 > fd1;
        Output.points[0][3] -= ld0;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
        fb0 = ld0 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
        } else {
        fd0 *= -1;
        Output.points[0][4] -= fd1;
        fd0 = fd1 - fd0;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              ab4 = fo0.m2();
}
            Output.points[0][5] -= fd1;
            fd0 *= -1;
if(fo1 != null){
              fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            boolean lb2 = false;
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
}}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    double ld1 = 536.2801778824256;
    ld1 = ad1 + ad2;
    lb0 = fb0 && fb1;
    ad3 = ad4 - fd0;
    Thought lo2 = Thought74.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    Output.points[0][6] -= fd1;
    ld1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    Output.points[0][7] -= fd1;
    if (lb0) {
if(fo1 != null){
          fb0 = fo1.m2();
}
if(fo0 != null){
          fb1 = fo0.m2(ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
        Thought lo3 = Thought47.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, fb0, fb1, lb0, fb0);
}
        ad2 = ad3 + ad4;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
        Thought lo4 = Thought96.getInstance(fd1, ld1, ad1, ad2);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought62.getInstance(ab4, fb0, fb1, ab1);
    ab2 = fd0 > fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
    for(int i0=0; i0<10; i0++){
        Output.points[0][8] -= fd0;
        ab2 = fd1 > ad1;
        ad2 = ad3 - ad4;
        fd0 = fd1 - ad1;
        Output.points[1][0] += ad2;
        ab3 = ab4 || fb0;
        fb1 = lb1 || ab1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        double ld2 = 834.8241495955318;
        Thought lo3 = Thought94.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
        fb1 = fd1 < ld2;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 170.33028811334933;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
if(ao3 != null){
      lb0 = ao3.m2(fb0, fb1, lb0, fb0);
}
    Output.points[1][1] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
    fb1 = fd1 > ld1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    ad1 = ad2 - ad3;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
    ad4 = fd0 + fd1;
    Thought lo0 = Thought25.getInstance();
    fb1 = ad1 < ad2;
    ad3 *= -1;
    Output.points[1][2] -= ad4;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    Output.points[1][3] -= fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    fb1 = ad1 < ad2;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[1][4] += fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    Thought lo1 = Thought32.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
    if (ab1) {
        fd1 *= -1;
        ab2 = ab3 || ab4;
        fd0 *= -1;
        } else {
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
        Output.points[1][5] += fd1;
        Thought lo2 = Thought73.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
        fd0 = fd1 + fd0;
        fd1 *= -1;
if(fo1 != null){
          fo1.m2(fb0, fb1, lb0, ab1);
}
        fd0 = fd1 + fd0;
        boolean lb3 = true;
if(ao1 != null){
          ab1 = ao1.m2();
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
        boolean lb4 = true;
        Output.points[1][6] += fd0;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    fd0 *= -1;
    boolean lb1 = true;
        ab3 = ab4 || fb0;
    fd1 = ad1 + ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, lb1, ab1);
}
    boolean lb2 = false;
    ab1 = !ab2;
    Thought lo3 = Thought20.getInstance(ad4, fd0, fd1, ad1);
    double ld4 = 390.76073122150336;
    Output.points[1][7] += ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought20.getInstance();
    fb1 = fb0 || fb1;
    double ld1 = 752.7579526645004;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    Thought lo2 = Thought35.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
    Output.points[1][8] += fd1;
    Thought lo3 = Thought37.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    Thought lo4 = Thought90.getInstance(ld1, fd0, fd1, ld1);
    double ld5 = 361.70654441804373;
    boolean lb6 = false;
    ld5 = fd0 - fd1;
    lb6 = !fb0;
    Thought lo7 = Thought46.getInstance(fo1, fo0, fo1, fo0, ld1, ld5, fd0, fd1);
    ld1 = ld5 - fd0;
    fb1 = fd1 < ld1;
    lb6 = fb0 && fb1;
    lb6 = ld5 > fd0;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
    double ld0 = 1.5717619095454012;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld0;
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2();
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
    Output.points[2][0] -= fd1;
    double ld2 = 370.03010541474936;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 612.5734206481598;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld2, ld3, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo0.m3(fd1, ld0, ld2, ld3);
}
    ab2 = fd0 < fd1;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld2, ld3, fd0);
}
    ab4 = fb0 || fb1;
    fd1 = ld0 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
    ld3 *= -1;

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
if(fo1 != null){
      fb0 = fo1.m2();
}
    if (fb1) {
        Thought lo0 = Thought24.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
        double ld1 = 668.958344147187;
        fd0 *= -1;
        boolean lb2 = false;
        fd1 *= -1;
        boolean lb3 = false;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        Thought lo4 = Thought56.getInstance(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, lb2, lb3, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
        Output.points[2][1] += ad4;
        boolean lb5 = false;
        Thought lo6 = Thought25.getInstance(fd0, fd1, ld1, ad1);
        ad2 = ad3 - ad4;
        fd0 *= -1;
        boolean lb7 = false;
        double ld8 = 949.7260175952242;
        fd0 = fd1 + ld1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld8, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4(lb2, lb3, lb5, lb7);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(ld1, ld8, ad1, ad2, fb0, fb1, lb2, lb3);
}
        lb5 = lb7 && fb0;
        ad3 = ad4 - fd0;
        fd1 = ld1 + ld8;
        double ld9 = 91.7585807099307;
        Thought lo10 = Thought18.getInstance(fo1, fo0, fo1, fo0);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    ad1 *= -1;
    Thought lo0 = Thought3.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    Output.points[2][2] += fd1;
    double ld1 = 15.836155343288564;
    Thought lo2 = Thought89.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
    Thought lo4 = Thought12.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
    ab3 = !ab4;
    fb0 = fb1 && lb3;
    Thought lo5 = Thought60.getInstance(ab1, ab2, ab3, ab4);
    for(int i0=0; i0<10; i0++){
        double ld6 = 142.31516173276208;
        ld1 = ad1 - ad2;
        ad3 = ad4 - fd0;
        fb0 = fd1 > ld6;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb1 = ld1 < ad1;
        boolean lb7 = true;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 528.5719341470142;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
        boolean lb1 = false;
        Output.points[2][3] += ld0;
        fd0 *= -1;
if(ao4 != null){
          fb0 = ao4.m2(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m1();
}
if(fo1 != null){
          fd1 = fo1.m3(ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought54.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought63.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
    double ld2 = 252.4772889706957;
    fb1 = fd0 < fd1;
if(ao4 != null){
      ld2 = ao4.m3(ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought34.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ad1);
    ad2 = ad3 - ad4;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    Output.points[2][4] -= ld2;
    boolean lb4 = false;
    Thought lo5 = Thought86.getInstance(lb4, fb0, fb1, lb4);
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
        Output.points[2][5] += ad4;
        }

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab2 = ab3 && ab4;
    boolean lb0 = false;
    ab4 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      lb0 = ao3.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
    fd1 = fd0 + fd1;
    ab2 = fd0 < fd1;
    boolean lb1 = true;
    ab2 = ab3 || ab4;
    Output.points[2][6] += fd0;
if(ao3 != null){
      ao3.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
        lb1 = !lb2;
    Output.points[2][7] += fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = ad1 + ad2;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
if(ao3 != null){
      fb1 = ao3.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;

Thought.STACK_COUNTER++;
return ao4;
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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought16.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    double ld1 = 359.1311255133729;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought60.getInstance();
    boolean lb3 = false;
    fd1 = ld1 - fd0;
    fd1 *= -1;
    boolean lb4 = true;
    boolean lb5 = true;
    ld1 *= -1;
    fd0 = fd1 + ld1;
if(fo1 != null){
      lb4 = fo1.m2(fd0, fd1, ld1, fd0, lb5, fb0, fb1, lb3);
}
    lb4 = fd1 > ld1;
    lb5 = fb0 && fb1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought91.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    fb0 = fd1 > fd0;
    fb1 = lb1 || fb0;
        fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    lb1 = fd0 < fd1;
    boolean lb2 = false;
    fd0 = fd1 - fd0;
    lb2 = fd1 < fd0;
    fb0 = fb1 && lb1;
    fd1 *= -1;
    lb2 = fb0 || fb1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, lb3, fb0);
}
    fb1 = !lb1;
    boolean lb4 = false;

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
    boolean lb0 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
    boolean lb3 = false;
    double ld4 = 264.6031034156974;
    Output.points[2][8] -= ld4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, lb3, fb0);
}
    fb1 = fd1 > ld4;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld4, fd0);
}
    fd1 = ld4 - fd0;
    double ld5 = 565.5446614045039;
    Thought lo6 = Thought63.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ld5);
if(fo1 != null){
      lb0 = fo1.m2(lb1, lb2, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld4, ld5, fd0, fb1, lb0, lb1, lb2);
}
    boolean lb7 = false;
    boolean lb8 = false;
    fd1 = ld4 + ld5;

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
