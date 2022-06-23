package genetic;
import java.util.ArrayList;
class Thought12 extends Thought{
private static ArrayList<Thought12> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 133.46609547697102;
private double fd1 = 471.9149566789576;
private Thought fo0 = null;
private Thought fo1 = null;
Thought12 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought12 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought12 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought12 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought12 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[3][6] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb0 = true;
    double ld1 = 465.2901959920848;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
    lb2 = ld1 > fd0;
    fd1 *= -1;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fb1 = !lb0;
    Thought lo3 = Thought42.getInstance(lb2, fb0, fb1, lb0);
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    ab2 = ab3 && ab4;
    Output.points[3][7] -= fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb0 = fb1 || ab1;
    Output.points[3][8] -= fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        ab1 = !ab2;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fd0 = fo0.m3(ab3, ab4, fb0, fb1);
}
        lb0 = fd1 < fd0;
        boolean lb1 = false;
if(fo1 != null){
          fo1.m2();
}
        Output.points[4][0] -= fd1;
        lb1 = ab1 || ab2;
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
    fb0 = ad1 > ad2;
    double ld0 = 823.2440465254771;
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought21.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    boolean lb2 = false;
    double ld3 = 217.4177351454615;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad1 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb2, fb0);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Output.points[4][1] -= ad4;
    fd0 *= -1;
    Output.points[4][2] += fd1;
    boolean lb0 = false;
    lb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fd1, ad1, ad2, ad3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = !fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought10.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;

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
    boolean lb0 = false;
    boolean lb1 = false;
    Thought lo2 = Thought77.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
    Thought lo3 = Thought34.getInstance(ao4, fo0, fo1, ao1);
    lb1 = fb0 || fb1;
    ad4 *= -1;
if(ao2 != null){
          lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    lb0 = lb1 || fb0;
    boolean lb4 = true;
    Thought lo5 = Thought35.getInstance(ad3, ad4, fd0, fd1);
    Thought lo6 = Thought16.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);

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
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(ao3 != null){
      fb1 = ao3.m2();
}
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ab1 = fd1 < fd0;
    Output.points[4][3] += fd1;
    fd0 = fd1 - fd0;
    ab2 = ab3 || ab4;
        fb0 = fb1 || ab1;
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ab4 = ad3 > ad4;
    double ld0 = 981.0342663350269;
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    ad4 = fd0 - fd1;
    ld0 = ad1 - ad2;
    Thought lo1 = Thought60.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
    boolean lb2 = false;
    ab4 = fb0 || fb1;
    lb2 = ld0 < ad1;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4();
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
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    Output.points[4][4] -= fd0;
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought80.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 281.37521635813357;
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought38.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = ld0 < fd0;

Thought.STACK_COUNTER++;
return lb1;
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
        fb1 = fb0 && fb1;
    Thought lo0 = Thought10.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = ad1 < ad2;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    double ld1 = 655.1280302176627;
    ad3 = ad4 + fd0;
    fd1 = ld1 - ad1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
    fd1 = ld1 - ad1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought47.getInstance();
    fb1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    double ld0 = 870.6609813097804;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    double ld1 = 241.42161535414593;
if(ao2 != null){
      ld0 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > fd0;
    fd1 = ld0 + ld1;
    fb1 = fd0 > fd1;
    Output.points[4][6] -= ld0;
if(ao3 != null){
      ao3.m3();
}
    fb0 = ld1 > fd0;
    fd1 *= -1;
    ld0 *= -1;
    ld1 = fd0 - fd1;
    ld0 = ld1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 = ld0 - ld1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb2, fb0);
}
        fd1 = ld0 + ld1;
    fb1 = lb2 && fb0;
    Thought lo3 = Thought80.getInstance(fd0, fd1, ld0, ld1);
    fb1 = fd0 < fd1;

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
    fb1 = ad1 < ad2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
if(ao1 != null){
      fo1 = ao1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    ad1 = ad2 + ad3;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo2 = Thought60.getInstance(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    if (lb1) {
        Thought lo3 = Thought77.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
        Output.points[4][7] -= fd1;
        fb0 = fb1 || lb0;
        Thought lo4 = Thought2.getInstance(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb0);
        lb1 = ad1 > ad2;
        boolean lb5 = true;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
        lb1 = fd1 < ad1;
        Thought lo6 = Thought64.getInstance(fb0, fb1, lb5, lb0);
        double ld7 = 579.6718591544393;
        } else {
        ad2 *= -1;
}
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
      fd0 = ao2.m3();
}
if(ao3 != null){
      ab2 = ao3.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    ab4 = fd0 < fd1;
    fb0 = !fb1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    Output.points[4][8] += fd0;
    ab2 = fd1 > fd0;
    Thought lo0 = Thought24.getInstance();
    Output.points[5][0] += fd1;
    ab3 = fd0 < fd1;
    Thought lo1 = Thought41.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad4 = fd0 + fd1;
    boolean lb0 = true;
    double ld1 = 101.10290273731546;
    ld1 *= -1;
    double ld2 = 859.0926907756465;
    ld2 = ad1 + ad2;
    if (ab4) {
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
        for(int i0=0; i0<10; i0++){
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
            fb1 = lb0 || ab1;
            ab2 = ld1 > ld2;
            ab3 = !ab4;
            ad1 *= -1;
            Thought lo3 = Thought87.getInstance(ad2, ad3, ad4, fd0);
            fb0 = fb1 && lb0;
if(fo1 != null){
              fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld1, ld2, ad1, ad2);
}
            ab1 = ab2 || ab3;
            ab4 = ad3 > ad4;
if(fo0 != null){
              fd0 = fo0.m3(fb0, fb1, lb0, ab1);
}
            boolean lb4 = true;
if(ao1 != null){
              fo1 = ao1.m4();
}
if(ao2 != null){
              ao2.m3(fd1, ld1, ld2, ad1, ab1, ab2, ab3, ab4);
}
            boolean lb5 = false;
            ab4 = fb0 || fb1;
            Output.points[5][1] -= ad2;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 619.288339916226;
    ld0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    fb0 = fd0 > fd1;
        ld0 *= -1;
    fb1 = !lb1;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fd0 = fd1 + ld0;
    fb1 = fd0 < fd1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    lb1 = fb0 && fb1;
    fd1 = ld0 + fd0;
    lb1 = fb0 || fb1;
    lb1 = fd1 < ld0;
    fb0 = fd0 > fd1;
    fb1 = !lb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    boolean lb2 = true;
    Output.points[5][2] -= fd0;

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
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[5][3] += fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && ab1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
        Output.points[5][4] += fd1;
        double ld0 = 449.4625322092643;
        ab4 = ld0 < fd0;
        fb0 = fd1 < ld0;
        double ld1 = 674.2457113367693;
        boolean lb2 = false;
        ld1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, ld1, fd0, fd1);
}
        fb0 = fb1 || lb2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
        double ld3 = 114.69094553193936;
        ab1 = ld0 > ld1;
        Thought lo4 = Thought29.getInstance(ab2, ab3, ab4, fb0);
        boolean lb5 = true;
if(fo0 != null){
          fb0 = fo0.m2();
}
if(fo1 != null){
          fb1 = fo1.m2(ld3, fd0, fd1, ld0, lb2, lb5, ab1, ab2);
}
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
    fd1 = ad1 - ad2;
    fb0 = fb1 || fb0;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fb0 = !fb1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][5] += ad1;
    Thought lo0 = Thought3.getInstance(ad2, ad3, ad4, fd0);
    Thought lo1 = Thought45.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    ab1 = !ab2;
    boolean lb2 = false;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    Thought lo3 = Thought63.getInstance(lb2, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[5][6] -= fd0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb2);
}
    ab1 = ad1 > ad2;
    ab2 = ab3 && ab4;
    ad3 = ad4 + fd0;
    Thought lo4 = Thought97.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb2, ab1);
}
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
        fb0 = fd1 > fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m1();
}
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo0 = Thought74.getInstance(fo0, fo1, ao1, ao2);
    Thought lo1 = Thought42.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;

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
    fb0 = fb1 && fb0;
    boolean lb0 = true;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
    ad2 *= -1;
    boolean lb1 = true;
    Output.points[5][7] -= ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      fo1 = ao1.m4(lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought89.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb1 = true;
    fb0 = !fb1;
    boolean lb2 = true;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb1, lb2, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Thought lo3 = Thought8.getInstance(fo1, ao1, ao2, ao3, fb1, lb1, lb2, ab1);
    Output.points[5][8] -= fd0;
    boolean lb4 = false;
    Thought lo5 = Thought47.getInstance(fd1, fd0, fd1, fd0);
    Thought lo6 = Thought29.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    Thought lo7 = Thought79.getInstance(ab1, ab2, ab3, ab4);
    Thought lo8 = Thought80.getInstance();
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
    fd1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld9 = 666.806396824899;
    lb4 = ld9 < fd0;
    ab1 = ab2 || ab3;
    fd1 = ld9 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld9, fd0, fd1, ld9, ab4, fb0, fb1, lb1);
}
    fd0 = fd1 + ld9;
    lb2 = lb4 || ab1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld9, fd0);
}
    fd1 *= -1;

Thought.STACK_COUNTER++;
return ld9;
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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, ab1, ab2);
}
    Output.points[6][0] += fd1;
if(ao2 != null){
      ad1 = ao2.m3();
}
    boolean lb0 = false;
    ab2 = ab3 || ab4;
    Output.points[6][1] += ad2;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m1(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}

Thought.STACK_COUNTER++;
return ad4;
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
    Output.points[6][2] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[6][3] -= fd0;
    Thought lo0 = Thought27.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld1 = 130.80697912842544;
    fb1 = fb0 || fb1;
    Thought lo2 = Thought69.getInstance(ld1, fd0, fd1, ld1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 = ld1 + fd0;
    fd1 = ld1 + fd0;
    boolean lb3 = false;
    lb3 = !fb0;
    fb1 = fd1 < ld1;
    fd0 = fd1 + ld1;
    boolean lb4 = false;
    fd0 *= -1;

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
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fb1 = !ab1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought41.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    Output.points[6][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, ab1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
    ad4 *= -1;
if(fo0 != null){
      fo0.m3();
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo0 = Thought41.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        Output.points[6][5] += ad2;
        fb0 = ad3 < ad4;
        fd0 = fd1 + ad1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        Output.points[6][6] -= fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fb1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        ad1 = ad2 + ad3;
        double ld1 = 585.4446942546338;
if(fo0 != null){
          ad3 = fo0.m3();
}
        if (fb0) {
if(fo1 != null){
              ad4 = fo1.m3(fd0, fd1, ld1, ad1, fb1, fb0, fb1, fb0);
}
            Output.points[6][7] -= ad2;
            double ld2 = 878.7819607596507;
            ad2 *= -1;
if(fo0 != null){
              fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
            fb1 = !fb0;
            fb1 = ld2 < ld1;
}}
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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
    boolean lb0 = false;
    boolean lb1 = false;
    double ld2 = 828.5774730360804;
    boolean lb3 = false;
    ld2 *= -1;
    lb0 = lb1 && lb3;
    ab1 = ad1 > ad2;
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    ad3 = ad4 + fd0;
    fb1 = lb0 && lb1;
if(fo1 != null){
      fo1.m2();
}
    Thought lo4 = Thought33.getInstance(fd1, ld2, ad1, ad2, lb3, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb3, ab1, ab2);
}
    ld2 = ad1 - ad2;
    boolean lb5 = false;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
    ab2 = ld2 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb0);
}
    boolean lb6 = false;
    boolean lb7 = false;
    Thought lo8 = Thought99.getInstance();
    ld2 *= -1;

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
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought21.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
        double ld1 = 16.65078699362396;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, ld1, fd0);
}
    fb0 = fd1 < ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
}
    boolean lb2 = false;
    boolean lb3 = false;
    Thought lo4 = Thought38.getInstance(lb3, fb0, fb1, lb2);
if(ao2 != null){
      ao2.m1();
}
    double ld5 = 509.71004693370236;
    double ld6 = 831.2510253933115;
    lb3 = ld6 < fd0;
    fd1 *= -1;
if(ao3 != null){
      ao3.m3(ld1, ld5, ld6, fd0, fb0, fb1, lb2, lb3);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld1, ld5, ld6, fd0, fb0, fb1, lb2, lb3);
}
    double ld7 = 853.6685282347718;
    double ld8 = 523.8240313922714;
    ld8 = fd0 + fd1;
    Thought lo9 = Thought63.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb2, lb3);
    fb0 = ld1 < ld5;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
    fb0 = ad1 > ad2;
    Thought lo0 = Thought34.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
    if (fb1) {
        ad3 = ad4 - fd0;
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
    Thought lo0 = Thought15.getInstance(fd1, fd0, fd1, fd0);
    ab1 = !ab2;
    double ld1 = 766.8804566777915;
    fd0 = fd1 + ld1;
    Thought lo2 = Thought42.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    double ld3 = 309.97739858207467;
    Output.points[6][8] -= fd0;
    boolean lb4 = true;
    boolean lb5 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab3 = fd1 > ld1;
    ab4 = ld3 > fd0;
if(ao3 != null){
      fd1 = ao3.m3(ld1, ld3, fd0, fd1, fb0, fb1, lb4, lb5);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    boolean lb6 = true;
    ld3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb4);
}
    lb5 = fd0 > fd1;
    boolean lb7 = true;
        Output.points[7][0] += ld1;
    ld3 = fd0 + fd1;
if(ao3 != null){
      ld1 = ao3.m3(ld3, fd0, fd1, ld1);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought33.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ad4 = fd0 - fd1;
    ab3 = !ab4;
    fb0 = fb1 || ab1;
    ad1 *= -1;
    double ld1 = 679.1714085144619;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld1;
    double ld2 = 791.0530427707845;
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = ab1 && ab2;
    double ld3 = 703.2931761282231;
if(ao4 != null){
      ao3 = ao4.m4(ld3, ad1, ad2, ad3);
}
    Thought lo4 = Thought92.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1);

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
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    double ld1 = 996.7229174275312;
    fb1 = lb0 && fb0;
    Output.points[7][1] -= ld1;
if(fo1 != null){
      fb1 = fo1.m2();
}
    Thought lo2 = Thought39.getInstance(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
    boolean lb3 = false;
    Thought lo4 = Thought2.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, lb3, fb0, fb1, lb0);
}
    ld1 *= -1;
    boolean lb5 = true;
    lb3 = !lb5;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb3);
}
    lb5 = fd0 < fd1;
    fb0 = ld1 > fd0;
    fd1 = ld1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
    Output.points[7][2] -= ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fb1 = lb0 || lb3;

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
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 > fd0;
    fd1 *= -1;
    boolean lb2 = false;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 225.92643801564984;
    ld0 *= -1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fb1 = fd1 > ld0;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
if(fo1 != null){
      ld0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought73.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo2 = Thought9.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    double ld3 = 696.0901773449671;
    fb0 = ld0 > ld3;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld3);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld3);
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
