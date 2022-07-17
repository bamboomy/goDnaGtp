package genetic;
import java.util.ArrayList;
class Thought55 extends Thought{
private static ArrayList<Thought55> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 162.7956016854919;
private double fd1 = 457.1904644753349;
private Thought fo0 = null;
private Thought fo1 = null;
Thought55 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought55 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought55 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought55 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought55 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[6][1] += fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        Thought lo1 = Thought45.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
        Output.points[6][2] += fd1;
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo1.m2();
}
        fd0 *= -1;
        Thought lo2 = Thought310.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
        double ld3 = 768.6799593792367;
        double ld4 = 758.5083969511338;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
        boolean lb5 = false;
        lb0 = lb5 && fb0;
        double ld6 = 958.2477939610116;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = !lb0;
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
    Thought lo0 = Thought193.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    if (ab4) {
        fb0 = fd0 < fd1;
        boolean lb1 = false;
        fd0 *= -1;
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        boolean lb2 = false;
        double ld3 = 365.4889791395231;
        fd0 = fd1 - ld3;
        ab4 = !fb0;
        double ld4 = 216.12245199663445;
        fb1 = ld4 > fd0;
        fd1 = ld3 - ld4;
        lb1 = fd0 < fd1;
        Output.points[6][3] += ld3;
        lb2 = ab1 || ab2;
if(fo0 != null){
          fo0.m2();
}
        ab3 = ld4 > fd0;
        fd1 *= -1;
if(fo1 != null){
          ld3 = fo1.m3(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld3, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
          lb2 = fo0.m2(ab1, ab2, ab3, ab4);
}
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
    double ld0 = 887.5414989017357;
    fb1 = !fb0;
    ad2 = ad3 - ad4;
    Thought lo1 = Thought302.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
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
    ab2 = ad1 > ad2;
    double ld0 = 549.7862092208297;
    ab3 = ad2 < ad3;
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
        ld0 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought241.getInstance(fd1, ld0, ad1, ad2);
    ab2 = ab3 || ab4;
    fb0 = ad3 > ad4;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 + ad4;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb2, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(lb2, ab1, ab2, ab3);
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
    double ld0 = 747.9740513372326;
    Output.points[6][4] += ld0;
    fd0 = fd1 + ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought340.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
    ld0 = fd0 - fd1;
    fb0 = ld0 > fd0;
    Output.points[6][5] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    ad1 *= -1;
    boolean lb0 = false;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought304.getInstance(ao3, ao4, fo0, fo1);
    fb1 = fd0 > fd1;
    lb0 = fb0 && fb1;
    ad1 = ad2 - ad3;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    double ld3 = 765.0786205414169;
    if (lb0) {
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ld3;
        double ld4 = 754.3765104682977;
if(ao2 != null){
          ao2.m1(ld3, ad1, ad2, ad3, lb2, fb0, fb1, lb0);
}
        lb2 = ad4 < fd0;
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
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb1 = ab1 || ab2;
    boolean lb0 = false;
    boolean lb1 = true;
    Thought lo2 = Thought108.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought107.getInstance(fb0, fb1, lb0, lb1);
    fd0 = fd1 - fd0;
    ab1 = fd1 > fd0;

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
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad3 = ad4 + fd0;
    boolean lb0 = true;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    Output.points[6][6] -= fd0;
    fd1 = ad1 - ad2;
        ab1 = ab2 && ab3;
    ad3 = ad4 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    ab4 = ad4 < fd0;
    fb0 = fd1 < ad1;
    double ld1 = 300.25892980325483;
    boolean lb2 = false;
    Thought lo3 = Thought330.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m3();
}
    fb0 = !fb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3, lb0, lb2, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    lb0 = ad4 < fd0;

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought232.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    lb1 = !fb0;
    fd0 = fd1 + fd0;
    Thought lo2 = Thought139.getInstance(fd1, fd0, fd1, fd0);
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
        boolean lb3 = true;
        lb3 = lb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb3, lb1, fb0);
}
        fb1 = fd0 < fd1;
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3();
}
    ab2 = fd0 > fd1;
    Thought lo0 = Thought205.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    Output.points[6][7] -= fd0;
    Output.points[6][8] -= fd1;
    fb0 = fb1 || ab1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought13.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ab2 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    double ld3 = 611.8890769341432;
    lb2 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld4 = 689.3506398637048;
    ld3 = ld4 - fd0;
    if (lb2) {
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 *= -1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 587.429207710732;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought126.getInstance(fb0, fb1, fb0, fb1);
    ad4 = fd0 + fd1;
    fb0 = fb1 && fb0;
    Output.points[7][0] -= ld0;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought143.getInstance(fo1, fo0, fo1, fo0);
    double ld3 = 430.417743097706;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
    double ld4 = 644.6631010123492;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ld4, ad1, ad2);
}
    ad3 *= -1;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb5 = false;
    boolean lb6 = true;
    Output.points[7][1] += ld3;
    boolean lb7 = false;
    Output.points[7][2] += ld4;
    ad1 *= -1;
    boolean lb8 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb6, lb7, lb8, fb0);
}
if(fo1 != null){
      fo1.m3();
}
    ad2 = ad3 + ad4;
    for(int i0=0; i0<10; i0++){
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    Output.points[7][3] -= fd0;
    boolean lb0 = true;
    Output.points[7][4] += fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    ab2 = !ab3;
    boolean lb1 = true;
    boolean lb2 = true;
    ab2 = fd0 < fd1;
    Thought lo3 = Thought163.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fd0 *= -1;
    Thought lo4 = Thought99.getInstance(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    Thought lo5 = Thought63.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, lb2, ab1);

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
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    double ld0 = 228.04055382259034;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
    fd0 *= -1;
    fd1 *= -1;
    fb0 = ld0 < fd0;
    Output.points[7][5] += fd1;

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
    boolean lb0 = true;
    Thought lo1 = Thought9.getInstance(lb0, fb0, fb1, lb0);
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && lb0;
        fb0 = fb1 || lb0;
    fb0 = ad4 > fd0;
if(ao1 != null){
      fb1 = ao1.m2(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    double ld2 = 196.84671529205642;
    boolean lb3 = false;
    ad4 = fd0 + fd1;
    lb0 = ld2 < ad1;
    lb3 = fb0 && fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab2 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought50.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Output.points[7][6] += fd1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      fd1 = ao4.m3();
}
    Output.points[7][7] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(lb1, lb2, ab1, ab2);
}
    if (ab3) {
        ab4 = fb0 || fb1;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 674.9783140905946;
    ld0 = ad1 - ad2;
    ab2 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + ld0;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4);
}
        Thought lo1 = Thought365.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ld0 = ad1 + ad2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    Thought lo2 = Thought68.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
        boolean lb1 = true;
        fb0 = !fb1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        lb1 = !lb0;
        fb0 = !fb1;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought267.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab1 = ab2 || ab3;
    boolean lb2 = true;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 *= -1;
    lb2 = fd0 < fd1;
    ab1 = fd0 > fd1;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    boolean lb4 = true;
    lb2 = lb3 && lb4;
    Thought lo5 = Thought207.getInstance(fo1, fo0, fo1, fo0);
    boolean lb6 = true;
    fd0 = fd1 + fd0;

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
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 && lb0;
    boolean lb1 = false;
    lb1 = ad3 > ad4;
        fb0 = !fb1;
    lb0 = lb1 && fb0;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    if (ab3) {
        Thought lo0 = Thought366.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
        boolean lb1 = true;
        ad3 *= -1;
if(fo1 != null){
          fo1.m2();
}
        ab1 = ab2 && ab3;
        ab4 = ad4 < fd0;
        fb0 = fb1 && lb1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        ad4 = fd0 + fd1;
        ad1 = ad2 - ad3;
        double ld2 = 890.1122377837515;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb1, ab1);
}
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
        boolean lb3 = false;
        ab2 = !ab3;
        ab4 = !fb0;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld2, ad1, ad2);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought191.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    Thought lo2 = Thought205.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb1 = lb1 && fb0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    fb1 = fd0 < fd1;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4);
}
    Output.points[7][8] -= fd0;
    Output.points[8][0] -= fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought355.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    fb1 = ad3 > ad4;
    double ld1 = 61.73878700776255;
    ad4 = fd0 - fd1;
    boolean lb2 = false;
    double ld3 = 415.6796544996742;

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
    boolean lb0 = false;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd0 *= -1;
    ab4 = fd1 > fd0;
    Thought lo1 = Thought183.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
    ab2 = ab3 || ab4;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
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
    ab1 = !ab2;
    double ld0 = 430.1837427769771;
        boolean lb1 = false;
    Thought lo2 = Thought305.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
        fd0 *= -1;
    ab2 = !ab3;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
    boolean lb3 = true;
    boolean lb4 = true;

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
    if (fb1) {
        fb0 = fd1 < fd0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 < fd0;
        fb1 = fb0 && fb1;
        fb0 = fd1 > fd0;
        fb1 = fb0 && fb1;
        double ld0 = 372.6573287395798;
        boolean lb1 = false;
        lb1 = fb0 || fb1;
        double ld2 = 922.68574475273;
        lb1 = ld2 < fd0;
        Thought lo3 = Thought51.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
          fo1.m1(fb1, lb1, fb0, fb1);
}
        lb1 = !fb0;
        fb1 = lb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = lb1 && fb0;
        fb1 = !lb1;
        boolean lb4 = true;
        fd1 *= -1;
        Output.points[8][1] += ld0;
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
        ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = fb0 || fb1;
    Output.points[8][2] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    Thought lo0 = Thought184.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
    double ld1 = 746.3401522656967;
if(fo0 != null){
      fd0 = fo0.m3();
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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ad2 = ad3 - ad4;
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    lb0 = fb0 || fb1;
    Thought lo1 = Thought233.getInstance(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
    ad1 *= -1;
    double ld2 = 538.1661469424538;

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
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb0 = !lb1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    boolean lb2 = false;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb2, ab1, ab2, ab3);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, lb0);
}
    Thought lo3 = Thought5.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    lb1 = lb2 || ab1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    ad2 *= -1;
    Thought lo4 = Thought290.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, ab1, ab2);
    ab3 = ad3 > ad4;
    Thought lo5 = Thought182.getInstance();

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        fd0 = fd1 - fd0;
        lb0 = fb0 && fb1;
        Output.points[8][3] -= fd1;
        fd0 = fd1 - fd0;
        boolean lb1 = true;
if(ao2 != null){
          fd1 = ao2.m3(lb0, lb1, fb0, fb1);
}
        lb0 = !lb1;
        boolean lb2 = true;
        lb2 = fb0 && fb1;
        lb0 = !lb1;
        lb2 = fd0 < fd1;
        fb0 = fd0 < fd1;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
}
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
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    if (fb0) {
        fb1 = fb0 && fb1;
        fd0 = fd1 - ad1;
        ad2 *= -1;
        boolean lb0 = false;
        ad3 *= -1;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
        boolean lb1 = false;
        boolean lb2 = false;
        boolean lb3 = true;
        Thought lo4 = Thought239.getInstance(ad2, ad3, ad4, fd0, lb0, lb1, lb2, lb3);
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(ao1 != null){
          lb2 = ao1.m2();
}
        double ld5 = 811.815615552194;
        boolean lb6 = false;
        double ld7 = 505.9370576743486;
        boolean lb8 = false;
        lb3 = !lb6;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld5, lb8, fb0, fb1, lb0);
}
        ld7 *= -1;
if(ao1 != null){
          ao1.m3(lb1, lb2, lb3, lb6);
}
        lb8 = fb0 || fb1;
        lb0 = !lb1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
        Output.points[8][4] -= ad1;
        lb2 = lb3 && lb6;
        boolean lb9 = false;
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    double ld0 = 721.6902089008773;
        boolean lb1 = false;
    ab1 = ld0 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ld0 < fd0;
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || lb1;
    Thought lo2 = Thought192.getInstance(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
    Thought lo3 = Thought370.getInstance(fb0, fb1, lb1, ab1);
    ld0 = fd0 + fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    double ld0 = 465.1970701800651;
    Output.points[8][5] -= ad3;
    ad4 = fd0 - fd1;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought346.getInstance(ld0, ad1, ad2, ad3);
    Thought lo3 = Thought272.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0);
    lb1 = ad1 > ad2;
    ab1 = ab2 || ab3;
    Thought lo4 = Thought187.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    Thought lo5 = Thought73.getInstance();
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ab4 = ao4.m2(fb0, fb1, lb1, ab1);
}
    double ld6 = 210.5544182273929;
    boolean lb7 = true;
    if (ab1) {
        Thought lo8 = Thought279.getInstance(fo0, fo1, ao1, ao2);
        ab2 = ab3 && ab4;
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
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought250.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
    double ld3 = 907.5446456394221;

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
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    boolean lb0 = false;
    double ld1 = 92.44725791385044;
if(fo1 != null){
          fo0 = fo1.m4();
}
    ld1 = fd0 + fd1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought198.getInstance(fd0, fd1, ld1, fd0);
    boolean lb3 = true;
    fb0 = fb1 && lb0;

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
      fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo0 = Thought100.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    double ld1 = 454.9510027989488;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
    Thought lo2 = Thought17.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
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
