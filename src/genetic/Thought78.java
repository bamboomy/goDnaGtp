package genetic;
import java.util.ArrayList;
class Thought78 extends Thought{
private static ArrayList<Thought78> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 163.44732873979683;
private double fd1 = 358.779114231271;
private Thought fo0 = null;
private Thought fo1 = null;
Thought78 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought78 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought78 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought78 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought78 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought78 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought78 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought78 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought78 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought78 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought78 instance = new Thought78 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought347.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought172.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = !fb1;
    fd0 *= -1;
    Output.points[3][6] += fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    fd0 *= -1;
    double ld0 = 700.2207084060651;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Output.points[3][7] -= fd0;
    Output.points[3][8] += fd1;
    fb1 = !ab1;
    ld0 = fd0 - fd1;
    Output.points[4][0] += ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = true;
    Output.points[4][1] += fd0;
    ab1 = ab2 && ab3;
        fd1 = ld0 + fd0;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, ab1);
}
    double ld2 = 269.9256112586974;
    ld0 *= -1;
    boolean lb3 = true;
    ld2 = fd0 - fd1;
if(fo0 != null){
      ld0 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld0);
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
    fb0 = fb1 && fb0;
    fb1 = ad2 > ad3;
    ad4 *= -1;
    fb0 = !fb1;
    Output.points[4][2] -= fd0;
    fd1 = ad1 - ad2;
    fb0 = ad3 > ad4;
    double ld0 = 772.1378705507535;
    ad4 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
    Thought lo1 = Thought384.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = fd1 < ld0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[4][3] += ad2;
    ad3 *= -1;
    Output.points[4][4] -= ad4;
    fb1 = fd0 > fd1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ab3 = fd1 < ad1;
    Thought lo0 = Thought330.getInstance(fo1, fo0, fo1, fo0);
        ad2 = ad3 + ad4;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    boolean lb2 = false;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
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
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    boolean lb1 = false;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        lb1 = fd1 < fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
        fb0 = fd1 < fd0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, lb0, lb1, fb0);
}
        Output.points[4][5] += fd0;
if(ao2 != null){
          fd1 = ao2.m3();
}
        fb1 = lb0 && lb1;
        fb0 = fb1 || lb0;
        lb1 = fb0 && fb1;
        if (lb0) {
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
              fd0 = ao3.m3(lb1, fb0, fb1, lb0);
}
            fd1 = fd0 + fd1;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
            boolean lb2 = false;
if(fo0 != null){
              ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
            fd0 *= -1;
if(fo1 != null){
              fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
            Thought lo3 = Thought337.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
            for(int i1=0; i1<10; i1++){
if(fo1 != null){
                  fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, lb0, lb1, fb0);
}
}}}
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
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ad4 = ao4.m3(fd0, fd1, ad1, ad2);
}
        }
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    Thought lo0 = Thought251.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
if(ao4 != null){
      ad2 = ao4.m3();
}
    Thought lo1 = Thought352.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);

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
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    ab2 = fd1 < fd0;
    fd1 *= -1;
    ab3 = fd0 < fd1;
    ab4 = fd0 < fd1;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;

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
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    double ld0 = 834.432942029687;
    Thought lo1 = Thought125.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
    if (ab4) {
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ld0 = ao2.m3(ad1, ad2, ad3, ad4);
}
        fb1 = lb2 || lb3;
        ab1 = ab2 && ab3;
        boolean lb4 = true;
        boolean lb5 = false;
        boolean lb6 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
}
        Output.points[4][6] += ad2;
if(ao3 != null){
          ad3 = ao3.m3(ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
        ad1 *= -1;
        ad2 *= -1;
        ad3 = ad4 + fd0;
        fd1 = ld0 + ad1;
        fb0 = ad2 < ad3;
        ad4 = fd0 - fd1;
        boolean lb7 = true;
        fb0 = ld0 < ad1;
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
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 < fd0;
    Output.points[4][7] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought223.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    fd1 *= -1;
    Thought lo2 = Thought96.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
    Output.points[4][8] += fd0;
    fd1 *= -1;
    fb1 = lb0 || ab1;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought313.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
    double ld5 = 584.7850149052699;
    Output.points[5][0] -= ld5;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld5, fd0, fb0, fb1, lb0, lb4);
}
    double ld6 = 613.3222902953576;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fb0 = ad1 < ad2;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fb1 = lb0 && fb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4();
}
        ab3 = ad1 < ad2;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = !ab1;
    ab2 = ad1 > ad2;
    ab3 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    double ld0 = 110.02213721874494;
    ab2 = !ab3;
    Thought lo1 = Thought306.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    double ld2 = 285.873803652042;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
        fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    double ld0 = 39.9774693987512;
    fb1 = !fb0;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3();
}
    fb1 = !fb0;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + fd0;
    Output.points[5][1] -= fd1;
if(fo1 != null){
      ld0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    fd0 *= -1;
    Thought lo1 = Thought56.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    Thought lo2 = Thought66.getInstance(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);

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
    Thought lo0 = Thought120.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    double ld2 = 727.9395213023362;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m1();
}
    double ld4 = 587.8761476908411;
    boolean lb5 = false;
    ld2 *= -1;
    ld4 = ad1 - ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2, lb1, lb3, lb5, fb0);
}
if(fo1 != null){
      ld4 = fo1.m3(fb1, lb1, lb3, lb5);
}
    ad1 = ad2 - ad3;
    double ld6 = 598.0399346736995;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && lb1;
    lb3 = lb5 && fb0;
    fb1 = !lb1;

Thought.STACK_COUNTER++;
return lb3;
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
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    double ld0 = 492.9447818378095;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought40.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    double ld2 = 348.07260008679935;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo1.m3();
}
    fb1 = !ab1;
    fd0 = fd1 + ld0;
    Thought lo3 = Thought202.getInstance(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    double ld4 = 884.1053832970586;
    fb1 = ld2 > ld4;
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(ab3, ab4, fb0, fb1);
}
    Output.points[5][2] -= fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, ld4, fd0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ld0, ld2, ld4);
}

Thought.STACK_COUNTER++;
return ab1;
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
    ad2 *= -1;
    ab2 = ab3 && ab4;
    Thought lo0 = Thought352.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    Thought lo1 = Thought39.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    ab1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      ad1 = fo1.m3();
}
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb3, ab1, ab2, ab3);
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
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
}
    double ld3 = 900.781625039476;
    double ld4 = 774.7822296013022;

Thought.STACK_COUNTER++;
return ld4;
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
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
    Output.points[5][3] += fd1;
    fd0 = fd1 + fd0;
    ab3 = !ab4;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    double ld0 = 717.639355225658;
    boolean lb1 = true;
    double ld2 = 359.9951027884743;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;
    double ld3 = 919.7111580823454;
    ld0 *= -1;
    ab2 = ab3 || ab4;
    Output.points[5][4] -= ld2;
    ld3 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, ld3, fd0);
}
    boolean lb4 = false;
    ab4 = fb0 || fb1;
    double ld5 = 914.1908777506336;
    lb1 = !lb4;
    ab1 = !ab2;
    boolean lb6 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}

Thought.STACK_COUNTER++;
return ld3;
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
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 592.3690051768835;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld3 = 5.026151406107118;
    ad4 *= -1;
    boolean lb4 = false;
    fd0 = fd1 + ld0;
    ld3 = ad1 - ad2;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb2, lb4, fb0, fb1);
}
    Output.points[5][5] += ld0;
if(fo0 != null){
      fo0.m2(lb1, lb2, lb4, fb0);
}
    ld3 *= -1;
    boolean lb5 = false;
    ad1 *= -1;
    boolean lb6 = true;
    ad2 = ad3 + ad4;
if(fo1 != null){
      lb6 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
    boolean lb7 = false;
    boolean lb8 = false;
    Thought lo9 = Thought382.getInstance(ld0, ld3, ad1, ad2);
    lb8 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3(ld3, ad1, ad2, ad3, lb1, lb2, lb4, lb5);
}
    double ld10 = 477.9935420300837;

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
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = lb1 && ab1;
    ab2 = ad1 > ad2;
    Thought lo2 = Thought366.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, lb1, ab1, ab2);
}
    ad1 *= -1;
    ad2 *= -1;
if(fo0 != null){
      fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    lb0 = lb1 && ab1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb3 = false;
    Thought lo4 = Thought374.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, lb3, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    boolean lb6 = true;
    ad4 = fd0 + fd1;
    lb3 = ad1 < ad2;

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
    Output.points[5][6] += fd1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought249.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    double ld2 = 650.215290404491;
    boolean lb3 = false;
    Thought lo4 = Thought198.getInstance(ao2, ao3, ao4, fo0, lb3, fb0, fb1, lb1);
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb3 = ld2 < fd0;
    fd1 = ld2 - fd0;
    Thought lo5 = Thought47.getInstance(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1, fb0, fb1, lb1, lb3);
    ld2 = fd0 + fd1;
    fb0 = ld2 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb1, lb3, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fd1 < ld2;
    lb1 = lb3 && fb0;
if(ao2 != null){
      ao2.m2(fd0, fd1, ld2, fd0);
}
    fb1 = lb1 || lb3;

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
    boolean lb0 = true;
    double ld1 = 11.943022096109248;
    lb0 = ld1 < ad1;
    fb0 = ad2 < ad3;
        Thought lo2 = Thought269.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1);
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    double ld3 = 436.50763520514727;
    lb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought148.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
        double ld5 = 468.8362522520245;
}
Thought.STACK_COUNTER++;
return ld1;
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
    for(int i0=0; i0<10; i0++){
        }
if(ao2 != null){
      ao2.m1();
}
    Output.points[5][7] -= fd1;
    fd0 *= -1;
    ab1 = ab2 || ab3;
    double ld0 = 453.2484262328826;
        fd0 *= -1;
    Thought lo1 = Thought196.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
    ld0 = fd0 + fd1;
    ab2 = ld0 < fd0;
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    if (ab3) {
        ab4 = fd1 < ld0;
        boolean lb2 = true;
        fd0 = fd1 - ld0;
        boolean lb3 = true;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
        ab3 = !ab4;
        fb0 = !fb1;
        boolean lb4 = true;
        boolean lb5 = true;
        lb2 = ld0 < fd0;
        fd1 = ld0 - fd0;
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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fb0 = fb1 || ab1;
    Thought lo0 = Thought260.getInstance();
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    double ld1 = 467.7875091390035;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, ab1, ab2, ab3);
}
    if (ab4) {
        ad3 = ad4 - fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        Thought lo2 = Thought129.getInstance(fd1, ld1, ad1, ad2);
        Output.points[5][8] -= ad3;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1);
}
        ad1 = ad2 - ad3;
        Thought lo3 = Thought354.getInstance(ad4, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
        ab3 = ad1 < ad2;
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
          ab2 = ao1.m2();
}
        boolean lb4 = false;
        Thought lo5 = Thought84.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
        fb1 = lb4 && ab1;
        ab2 = ab3 || ab4;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = !fb1;
    Thought lo1 = Thought133.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fb0 || fb1;
    Thought lo2 = Thought249.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb3 = true;
    double ld4 = 782.3055272886606;
    fd0 = fd1 + ld4;
    lb3 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb3, fb0, fb1);
}
    lb0 = !lb3;
    fb0 = fb1 || lb0;
    Output.points[6][0] -= fd1;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    fd0 = fd1 + fd0;
    ab4 = fb0 || fb1;
    lb0 = fd1 > fd0;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    Thought lo2 = Thought262.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
        double ld3 = 440.5410677398758;
    double ld4 = 965.9425073554187;
    ld3 *= -1;
        ab3 = ld4 > fd0;

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
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld0 = 859.9699890037798;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      ad1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought318.getInstance(fo0, fo1, fo0, fo1);
    ad2 *= -1;
    Thought lo2 = Thought1.getInstance(ad3, ad4, fd0, fd1);
    fb0 = ld0 > ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ld0;
    Output.points[6][1] += ad1;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    double ld2 = 75.30644305606255;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, ad1, ad2);
}
    lb1 = ab1 || ab2;
    double ld3 = 877.4891032975929;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 && ab1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought322.getInstance();

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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    double ld1 = 613.2630145481369;
    Output.points[6][2] += ld1;
    fb0 = fb1 || lb0;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
        fb1 = fd1 < ld1;
    Thought lo2 = Thought3.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1);
}
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > ld1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        Output.points[6][3] += fd1;
        ld1 = fd0 + fd1;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(fb1, lb0, fb0, fb1);
}
        lb0 = fb0 && fb1;
        boolean lb3 = false;
        double ld4 = 106.11931595860695;
        if (lb3) {
}}
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
    if (fb1) {
        if (fb0) {
if(ao2 != null){
              ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
            fb1 = fb0 || fb1;
            boolean lb0 = true;
            ad1 = ad2 + ad3;
            ad4 = fd0 + fd1;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
            Output.points[6][4] += fd0;
if(ao3 != null){
              lb0 = ao3.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
              fb1 = ao4.m2(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
}}
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
    fd1 = fd0 + fd1;
    double ld0 = 962.8000659696695;
    ab2 = ab3 && ab4;
    ld0 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought74.getInstance(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
if(ao2 != null){
      ao2.m2(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    for(int i0=0; i0<10; i0++){
        ab3 = fd0 > fd1;
        ld0 *= -1;
        fd0 = fd1 + ld0;
        ab4 = !fb0;
        fd0 = fd1 + ld0;
        double ld2 = 908.5769613891047;
        Thought lo3 = Thought234.getInstance(ao3, ao4, fo0, fo1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ab2 = ao2.m2(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ad4 = ao3.m3();
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m2(fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 && ab1;
if(ao3 != null){
      ao3.m2(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
    ab1 = !ab2;
    ab3 = ad1 > ad2;
    ab4 = ad3 < ad4;
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 > fd1;
if(ao3 != null){
          ad1 = ao3.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
        fd1 = ad1 - ad2;
        ab4 = ad3 < ad4;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Thought lo0 = Thought261.getInstance();
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    Thought lo1 = Thought177.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    Thought lo2 = Thought208.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    double ld3 = 435.10377300285535;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld3, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo4 = Thought89.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
        fd1 = ld3 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    Output.points[6][5] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
        Thought lo2 = Thought118.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);

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
    double ld0 = 680.0088126337366;
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    fd1 *= -1;
    ld0 *= -1;
    lb1 = !fb0;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fd0 < fd1;
    ld0 = fd0 + fd1;
    Output.points[6][6] -= ld0;
    boolean lb2 = true;
    fd0 = fd1 - ld0;

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
