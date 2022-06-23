package genetic;
import java.util.ArrayList;
class Thought45 extends Thought{
private static ArrayList<Thought45> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 292.0007409694855;
private double fd1 = 202.12244275223668;
private Thought fo0 = null;
private Thought fo1 = null;
Thought45 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought45 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought45 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought45 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought45 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought45 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought45 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought45 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought45 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 70.6792538727884;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3();
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought10.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought84.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        fd1 = fd0 + fd1;
        fd0 *= -1;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
        fd0 = fd1 + fd0;
        fd1 *= -1;
        double ld2 = 228.5835079026644;
        ld2 = fd0 + fd1;
        boolean lb3 = false;
        lb3 = ld2 < fd0;
        }
    Output.points[0][3] += fd0;
    ab3 = ab4 && fb0;
    double ld4 = 347.89796387437065;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[0][4] += fd0;
    Thought lo5 = Thought26.getInstance(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1, fb1, ab1, ab2, ab3);
    ld4 *= -1;
    double ld6 = 574.9788975893421;
    double ld7 = 633.0543691450017;
    double ld8 = 339.30533347266373;
    Thought lo9 = Thought55.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(ld6, ld7, ld8, fd0);
}
    fd1 *= -1;
    ld4 *= -1;

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
    fb1 = !fb0;
    ad2 *= -1;
    double ld0 = 100.25203412009218;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2();
}
    if (fb0) {
        Output.points[0][5] += fd1;
        } else {
        boolean lb2 = true;
        fb0 = fb1 && lb2;
        lb1 = !fb0;
if(fo0 != null){
          fo0.m2(ld0, ad1, ad2, ad3, fb1, lb2, lb1, fb0);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
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
    ab1 = !ab2;
    ad1 = ad2 - ad3;
    double ld0 = 163.78409308611472;
    double ld1 = 359.8439494034986;
    Thought lo2 = Thought34.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1();
}
    fd1 *= -1;

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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought69.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    Output.points[0][6] -= fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    Output.points[0][7] -= fd0;
    fb0 = fb1 || lb1;

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
    ad2 = ad3 + ad4;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    for(int i0=0; i0<10; i0++){
        Output.points[0][8] -= fd0;
        Thought lo1 = Thought31.getInstance(fb0, fb1, lb0, fb0);
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd1 = ad1 - ad2;
        Output.points[1][0] += ad3;
        boolean lb2 = true;
if(ao4 != null){
          ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb2, lb0);
}
if(fo0 != null){
          ad2 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, lb2, lb0);
}
        Thought lo3 = Thought77.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb2, lb0);
        boolean lb4 = true;
if(ao2 != null){
          ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 + ad2;
        Output.points[1][1] += ad3;
        boolean lb5 = true;
        lb5 = lb0 && fb0;
        ad4 = fd0 - fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
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
    double ld0 = 819.5698488495581;
if(ao1 != null){
      ld0 = ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    fb0 = fb1 && ab1;
    double ld1 = 90.44236464120686;
    fd0 = fd1 - ld0;
    Thought lo2 = Thought32.getInstance(ld1, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Output.points[1][2] -= ld1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ld0;
    Thought lo3 = Thought5.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
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
    boolean lb0 = true;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    ab1 = !ab2;
    boolean lb1 = true;
    boolean lb2 = false;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    ab2 = !ab3;
    Thought lo3 = Thought57.getInstance(ab4, fb0, fb1, lb0);
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb1 = lb2 && ab1;
    Thought lo4 = Thought14.getInstance(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
    ad3 = ad4 + fd0;
    fb1 = lb0 && lb1;
    fd1 = ad1 + ad2;
    Thought lo5 = Thought16.getInstance(ao4, fo0, fo1, ao1);
    ad3 = ad4 + fd0;
    boolean lb6 = false;
    lb2 = lb6 && ab1;
    Thought lo7 = Thought44.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, lb1, lb2);
}
    lb6 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(ad4, fd0, fd1, ad1);
}
    ab3 = ad2 > ad3;
    double ld8 = 159.08446116391065;
    if (ab4) {
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
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    fb0 = fb1 && lb0;
    double ld1 = 359.368388932968;
    fb0 = ld1 < fd0;
    fd1 *= -1;
    ld1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
        fb0 = fd1 > ld1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb2 = true;
        }
    fb0 = fd1 > ld1;
    fb1 = !lb0;
    fb0 = fd0 > fd1;
    Thought lo3 = Thought73.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
        double ld4 = 1000.7766000970053;
    ld4 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    ld1 *= -1;

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
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought21.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = true;
    ab2 = ab3 || ab4;
    Thought lo4 = Thought50.getInstance();
    boolean lb5 = false;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
    Output.points[1][3] += fd0;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    double ld6 = 385.99747283505945;
    ld6 = fd0 - fd1;
    Output.points[1][4] -= ld6;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld6, fd0, lb5, ab1, ab2, ab3);
}
    boolean lb7 = true;
    ab3 = ab4 || fb0;
    fb1 = lb1 || lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb5, lb7, ab1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought14.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 211.57386841187625;
    double ld2 = 744.1344468214152;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    double ld3 = 413.13301782727723;
    fb0 = ld2 < ld3;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    Thought lo4 = Thought21.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld2, ld3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld6 = 53.41217036401938;
    fb0 = fb1 || lb5;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb5, fb0, fb1, lb5);
}
if(fo0 != null){
      fb0 = fo0.m2();
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
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    double ld0 = 409.4253333368989;
        if (fb0) {
        fb1 = ad4 > fd0;
        ab1 = fd1 > ld0;
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
        Output.points[1][5] -= ad1;
        Thought lo1 = Thought31.getInstance();
        fb1 = !ab1;
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb1 = ab1 && ab2;
        boolean lb2 = true;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        fb1 = fd0 > fd1;
        Thought lo3 = Thought96.getInstance(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    double ld0 = 232.81550375806077;
    double ld1 = 685.7915441768631;
if(ao1 != null){
      ao1.m3(ld0, ld1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ld1, fd0, fd1);
}
    fb0 = ld0 < ld1;
    fd0 = fd1 - ld0;
    Thought lo2 = Thought56.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = ld1 > fd0;
    fb0 = fb1 && fb0;
    boolean lb3 = false;
    fd1 *= -1;
    Output.points[1][6] += ld0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo4 = Thought56.getInstance(ld1, fd0, fd1, ld0, fb0, fb1, lb3, fb0);
    boolean lb5 = true;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1, fb0, fb1, lb3, lb5);
}
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb3, lb5);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    boolean lb0 = true;
    fb0 = ad3 > ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    fb1 = ad3 > ad4;
    lb0 = fb0 || fb1;
if(ao2 != null){
      fd0 = ao2.m3(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought25.getInstance();
    Thought lo2 = Thought43.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    lb0 = ad2 > ad3;
    Thought lo3 = Thought68.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
    fb1 = ad4 < fd0;
    fd1 *= -1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb4 = true;
    ad4 *= -1;
    boolean lb5 = false;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, lb4, lb5, fb0);
}
    fb1 = !lb0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2();
}
    Thought lo0 = Thought42.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    Thought lo1 = Thought46.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought57.getInstance(fd0, fd1, fd0, fd1);
    Thought lo3 = Thought70.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      fd0 = ao4.m3();
}
    ab3 = fd1 > fd0;
    double ld4 = 48.89568801170671;
    fd0 = fd1 + ld4;
    ab4 = !fb0;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld4, fd0, fb1, ab1, ab2, ab3);
}
    double ld5 = 612.4659557370545;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        Thought lo0 = Thought73.getInstance(fd1, ad1, ad2, ad3);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
          ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo0 != null){
          fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
        }
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    Thought lo0 = Thought66.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
    Thought lo1 = Thought30.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought88.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 || fb1;
    Output.points[1][7] -= fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[1][8] -= fd1;
    if (fb0) {
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
            double ld3 = 981.8858290814878;
            boolean lb4 = false;
            lb4 = fb0 && fb1;
            Output.points[2][0] += ld3;
            boolean lb5 = true;
            double ld6 = 8.4810730926932;
            double ld7 = 488.2683392990801;
            ld6 = ld7 + fd0;
            double ld8 = 344.89925276025235;
}}
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
    Thought lo0 = Thought54.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    double ld1 = 431.01322460040575;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    ab3 = ab4 || fb0;
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    fb1 = ab1 && ab2;
    ab3 = ld1 > fd0;
    ab4 = fb0 || fb1;
        ab1 = fd1 > ld1;
    Output.points[2][1] -= fd0;
    ab2 = !ab3;
    Thought lo2 = Thought64.getInstance(ab4, fb0, fb1, ab1);
    fd1 *= -1;
    ld1 = fd0 - fd1;
if(fo1 != null){
      ab2 = fo1.m2();
}
    ab3 = ab4 && fb0;
    ld1 = fd0 + fd1;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0, fb1, ab1, ab2, ab3);
}
    Output.points[2][2] += fd1;
    Output.points[2][3] += ld1;
    boolean lb3 = true;
    fd0 = fd1 - ld1;

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
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    Output.points[2][4] += fd1;
    Thought lo0 = Thought56.getInstance(fo1, fo0, fo1, fo0);
    fb0 = !fb1;
    Thought lo1 = Thought41.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 675.0743593835302;
    Thought lo1 = Thought72.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
    ab2 = ab3 || ab4;
    ad4 *= -1;
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    fd0 = fd1 + ld0;
    ad1 = ad2 + ad3;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    double ld2 = 363.59599412089216;
if(fo1 != null){
      ad3 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    ld2 = ad1 + ad2;
    Thought lo3 = Thought14.getInstance(fo0, fo1, fo0, fo1);
    ab4 = fb0 || fb1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ld0 > ld2;
    ad1 *= -1;
    ab1 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
    fb1 = !ab1;

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
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought65.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought54.getInstance(ao2, ao3, ao4, fo0);
    for(int i0=0; i0<10; i0++){
        double ld2 = 86.66574605444318;
        boolean lb3 = true;
        Thought lo4 = Thought87.getInstance(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2, fb0, fb1, lb3, fb0);
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb3, fb0, fb1);
}
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
    Thought lo0 = Thought20.getInstance(ad1, ad2, ad3, ad4);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    double ld1 = 785.8240603250922;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
    if (fb1) {
        Thought lo2 = Thought91.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
        Output.points[2][5] -= ld1;
        ad1 *= -1;
        fb1 = fb0 && fb1;
        fb0 = fb1 || fb0;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought63.getInstance(fd0, fd1, fd0, fd1);
    Thought lo2 = Thought73.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    Thought lo3 = Thought71.getInstance(lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m2();
}
    Thought lo4 = Thought24.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    Output.points[2][6] += fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;

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
    boolean lb0 = true;
    Thought lo1 = Thought84.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    boolean lb2 = false;
    Thought lo3 = Thought58.getInstance(ad2, ad3, ad4, fd0);
    ab4 = fd1 > ad1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    boolean lb4 = false;
if(ao4 != null){
      ao4.m1(ab4, fb0, fb1, lb0);
}
    boolean lb5 = false;
    lb2 = lb4 && lb5;
    fd1 = ad1 + ad2;
    Thought lo6 = Thought63.getInstance();
    ab1 = ad3 > ad4;
    Output.points[2][7] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Output.points[2][8] -= fd0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    fd1 = ad1 + ad2;
    double ld7 = 244.08266326819313;
    ad2 = ad3 - ad4;
    Thought lo8 = Thought31.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld7, ad1, fb1, lb0, lb2, lb4);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb5, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return ad2;
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    if (fb1) {
        boolean lb0 = false;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        Output.points[3][0] -= fd1;
        double ld1 = 514.2323110735148;
        boolean lb2 = false;
        lb2 = !fb0;
        fb1 = ld1 > fd0;
        fd1 *= -1;
        double ld3 = 499.04259990808026;
        boolean lb4 = true;
if(fo1 != null){
          fo1.m3(lb0, lb2, lb4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        } else if (fb0) {
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Thought lo5 = Thought92.getInstance(fo0, fo1, fo0, fo1);
        fb1 = !fb0;
        } else {
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = fd0 - fd1;
        if (fb1) {
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
              fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
            Output.points[3][1] += fd0;
            fb0 = fd1 < fd0;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought0.getInstance();
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    lb1 = fd1 > fd0;
    ab1 = ab2 || ab3;
        boolean lb2 = true;
    if (ab3) {
        Thought lo3 = Thought8.getInstance(fo0, fo1, fo0, fo1);
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        fd1 = fd0 + fd1;
        lb4 = lb1 || lb2;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
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
    fb1 = !fb0;
    Thought lo0 = Thought88.getInstance(ad2, ad3, ad4, fd0);
    boolean lb1 = false;
    fb0 = fd1 > ad1;
    fb1 = !lb1;
    boolean lb2 = false;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(lb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought9.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
}
    lb1 = lb2 && fb0;
    fb1 = lb1 || lb2;
    fd0 = fd1 + ad1;
    double ld4 = 988.547611378685;
    Output.points[3][2] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb5 = true;
if(fo0 != null){
      lb5 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb2);
}
    fd1 = ld4 + ad1;
    ad2 *= -1;
    Thought lo6 = Thought1.getInstance(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb1);
    lb2 = !lb5;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
        fb0 = fb1 || lb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, ad1, ad2, ad3);
}
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
    ad1 = ad2 - ad3;
    if (ab2) {
        ad4 *= -1;
        fd0 = fd1 + ad1;
if(fo0 != null){
          ad2 = fo0.m3(ab3, ab4, fb0, fb1);
}
        Thought lo0 = Thought79.getInstance();
        ab1 = ad3 < ad4;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        fb1 = !ab1;
        ad3 = ad4 + fd0;
        ab2 = ab3 || ab4;
        fb0 = fb1 || ab1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 < fd0;
    double ld0 = 953.9235235497995;
    boolean lb1 = false;
        Thought lo2 = Thought51.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    fb0 = fd1 < ld0;
    fd0 = fd1 - ld0;
    boolean lb3 = true;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb3);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
}
    boolean lb4 = true;
    double ld5 = 630.9543960868199;
    fb0 = ld0 < ld5;
    Thought lo6 = Thought19.getInstance(fb1, lb1, lb3, lb4);
    fd0 = fd1 + ld0;
if(fo0 != null){
      fb0 = fo0.m2();
}
    double ld7 = 621.718496820401;
    Thought lo8 = Thought82.getInstance(ld5, ld7, fd0, fd1, fb1, lb1, lb3, lb4);
    Thought lo9 = Thought77.getInstance(fo1, ao1, ao2, ao3);
    fb0 = ld0 > ld5;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld7, fd0, fd1, ld0, fb1, lb1, lb3, lb4);
}
    boolean lb10 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    boolean lb0 = false;
    lb0 = ad4 < fd0;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3);
}
    Output.points[3][3] -= ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    Output.points[3][4] += ad1;

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
if(ao2 != null){
      ao2.m1();
}
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
        Thought lo0 = Thought11.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
        fd1 *= -1;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        boolean lb1 = false;
        boolean lb2 = true;
        double ld3 = 353.6553157208358;
        ld3 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, lb2, ab1, ab2);
}
if(ao2 != null){
          ao1 = ao2.m4(ld3, fd0, fd1, ld3);
}
        boolean lb4 = true;
        ab2 = ab3 || ab4;
        fb0 = fd0 > fd1;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld3);
}
if(ao3 != null){
          ao2 = ao3.m4(lb1, lb2, lb4, ab1);
}
        Output.points[3][5] += fd0;
if(fo0 != null){
          ao4 = fo0.m4();
}
        Output.points[3][6] -= fd1;
        ab2 = ab3 || ab4;
        fb0 = ld3 < fd0;
        fb1 = !lb1;
if(fo1 != null){
          fo1.m3(fd1, ld3, fd0, fd1, lb2, lb4, ab1, ab2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab2 = ab3 || ab4;
    fb0 = ad1 > ad2;
    ad3 *= -1;
    fb1 = ad4 < fd0;
    fd1 *= -1;
    double ld0 = 349.8883003155079;
    double ld1 = 633.7333430889233;
    ld0 *= -1;
    ab1 = ld1 < ad1;
    ab2 = ad2 < ad3;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ab2 = ld1 < ad1;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb2 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ld1, ad1);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 = ld0 - ld1;
    ab1 = ad1 > ad2;
    ad3 *= -1;

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
        double ld0 = 33.30465842112892;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[3][7] += ld0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      ld0 = fo1.m3();
}
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < ld0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    fd0 = fd1 - ld0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[3][8] -= fd1;
    ld0 = fd0 + fd1;
    Output.points[4][0] += ld0;
    fd0 = fd1 - ld0;
    fb0 = fb1 && fb0;
    Output.points[4][1] -= fd0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    Thought lo1 = Thought61.getInstance(fd1, ld0, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
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
    Thought lo0 = Thought31.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo1 = Thought3.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        Output.points[4][2] -= fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[4][3] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[4][4] += fd1;
    Output.points[4][5] += fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
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
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd1 < fd0;

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
